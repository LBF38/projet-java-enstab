public class recursivite {
    public static int factorielle(int nombre) {
        if (nombre==1 || nombre==0){
            return 1;
        }
        return factorielle(nombre-1)*nombre;
    }
    public static int fibonacci(int n) {
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String args[]) {
        System.out.println("Factoriel de 5: doit être égal à 120");
        int nombre=5;
        System.out.println(factorielle(nombre));
        System.out.println("Fibonacci de 16: doit être égal à 987");
        System.out.println(fibonacci(16));
    }
}

