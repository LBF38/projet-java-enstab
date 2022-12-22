package comptes_crediteurs;

public class Main {
    public static void main(String[] args) {
        Payable[] payables = new Payable[4];
        payables[0] = new Invoice(1, "Laptop", 2, 1000);
        payables[1] = new Invoice(2, "Mouse", 3, 50);
        payables[2] = new SalariedEmployee("John", "Doe", "123-45-6789", 1000);
        payables[3] = new SalariedEmployee("Jane", "Doe", "987-65-4321", 2000);

        for (Payable payable : payables) {
            System.out.println(payable);
            System.out.printf("Payment amount: %.2f %n", payable.getPaymentAmount());
        }
    }
}
