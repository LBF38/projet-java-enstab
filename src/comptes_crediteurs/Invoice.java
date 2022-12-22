package comptes_crediteurs;

public class Invoice implements Payable {
    private Number partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(Number partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    @Override
    public double getPaymentAmount() {
        return quantity * pricePerItem;
    }

    @Override
    public String toString() {
        return String.format("Invoice: \nPart number: %s\nPart description: %s\nQuantity: %d\nPrice per item: %.2f",
                partNumber, partDescription, quantity, pricePerItem);
    }
}
