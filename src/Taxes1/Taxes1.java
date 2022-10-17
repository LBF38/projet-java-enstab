package Taxes1;

public class Taxes1 {
    public static void main(String[] args) {
        // Data of the first car (brand and cylinder capacity):
        String brand1 = "Toyota";
        int cylinderCapacity1 = 1598;
        // Data of the second car (brand and cylinder capacity):
        String brand2 = "BMW";
        int cylinderCapacity2 = 2756;
        System.out.println("FLEET AND TAXES OF THE ORIGINAL PROGRAM");
        // Display Fleet:
        displayCar(brand1, cylinderCapacity1);
        displayCar(brand2, cylinderCapacity2);
        // Calculation and display of total taxes:
        displayFleetTaxes(cylinderCapacity1, cylinderCapacity2);
    }

    static void displayCar(String brand, int cylinderCapacity) {
        // Display the information of the car
        System.out.println("You have a " + brand +
                " with a cylinder capacity of " + cylinderCapacity);
    }

    static void displayFleetTaxes(double cylinderCapacity1, double cylinderCapacity2) {
        // calculate and display the total taxes of the two cars
        double taxes = calculateFleetTaxes(cylinderCapacity1, cylinderCapacity2);
        System.out.println("Total taxes to pay : " + taxes + " euros");
    }

    static double calculateFleetTaxes(double cylinderCapacity1, double cylinderCapacity2) {
        // Calculate the total taxes of the two cars
        double tax1 = calculateCarTaxes(cylinderCapacity1);
        double tax2 = calculateCarTaxes(cylinderCapacity2);
        return (tax1 + tax2);
    }

    static double calculateCarTaxes(double cylinderCapacity) {
        // return the tax to pay for a car with an indicated cylinder capacity
        double tax;
        if (cylinderCapacity <= 1600)
            tax = 300.0;
        else if (cylinderCapacity <= 2300)
            tax = 500.0;
        else
            tax = 700.0;
        return tax;
    }
}
