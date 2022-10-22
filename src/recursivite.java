public class recursivite {
    public static int factorielle(int nombre) {
        if (nombre == 1 || nombre == 0) {
            return 1;
        }
        return factorielle(nombre - 1) * nombre;
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int ackermann(int m, int n) {
        if (m == 0) {
            return n + 1;
        }
        if (n == 0) {
            return ackermann(m - 1, 1);
        }
        return ackermann(m - 1, ackermann(m, n - 1));
    }

    public static int pgcd(int a,int b) {
        if (b==0){
            return a;
        }
        int c=a%b;
        return pgcd(b, c);
    }

    public static void main(String args[]) {
        System.out.println("Factoriel de 5: doit être égal à 120");
        int nombre = 5;
        System.out.println(factorielle(nombre));
        System.out.println("Fibonacci de 16: doit être égal à 987");
        System.out.println(fibonacci(16));
        System.out.println("Ackermann de 2 et 2: doit être égal à 7");
        System.out.println(ackermann(2, 2));
        System.out.println("PGCD de 79 et 35: doit être égal à 1");
        System.out.println(pgcd(79, 35));
    }
}
