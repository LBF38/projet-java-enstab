package arithmetiques;

public class Main {
    public static void main(String[] args) {
        /* coding of the function f(x) = 2 * sin(x) + 3 * cos(x) */
        Expression f = new Addition(
                new Multiplication(new Constant(2), new Sin(new Variable())), new Multiplication(new Constant(3),
                        new Cos(new Variable()))); /* calculate the value of f(x) for some values of x */
        double[] tab = { 0, 0.5, 1, 1.5, 2, 2.5 };
        for (int i = 0; i < tab.length; i++) {
            double x = tab[i];
            System.out.println("f(" + x + ") = " + f.valeur(x));
        }
    }
}
