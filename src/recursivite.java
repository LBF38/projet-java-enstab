public class recursivite {
    public static int factorielle(int nombre) {
        if (nombre==1){
            return 1;
        }
        return factorielle(nombre-1)*nombre;
    }
    public static void main(String args[]) {
        int nombre=5;
        System.out.println(factorielle(nombre));

    }
}

