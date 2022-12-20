package Taxes1;

public class Fleet {
    Car c1;
    Car c2;

    public Fleet(Car c1, Car c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    void displayFleetTaxes() {
        // calculate and display the total taxes of the two cars
        double taxes = this.calculateFleetTaxes();
        System.out.println("Total taxes to pay : " + taxes + " euros");
    }

    double calculateFleetTaxes() {
        // Calculate the total taxes of the two cars
        double tax1 = c1.calculateCarTaxes();
        double tax2 = c2.calculateCarTaxes();
        return (tax1 + tax2);
    }

    void displayFleet() {
        c1.displayCar();
        c2.displayCar();
    }

}
