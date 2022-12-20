package Taxes1;

public class Car {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    private int cylinderCapacity;

    public int getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(int cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    public Car(String brand, int cylinderCapacity) {
        this.brand = brand;
        this.cylinderCapacity = cylinderCapacity;
    }

    void displayCar() {
        // Display the information of the car
        System.out.println("You have a " + this.brand +
                " with a cylinder capacity of " + this.cylinderCapacity);
    }

    double calculateCarTaxes() {
        // return the tax to pay for a car with an indicated cylinder capacity
        double tax;
        if (this.cylinderCapacity <= 1600)
            tax = 300.0;
        else if (this.cylinderCapacity <= 2300)
            tax = 500.0;
        else
            tax = 700.0;
        return tax;
    }
}
