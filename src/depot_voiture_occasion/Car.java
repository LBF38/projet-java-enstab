package depot_voiture_occasion;

import java.util.ArrayList;

public class Car {
    public enum Condition {
        GOOD, BAD, AVERAGE
    }

    private int seriesNumber;
    private String manufacturer;
    private String manufactureDate;
    private String acquisitionDate;
    private String acquisitionCos;
    private int salePrice;
    private Condition condition;

    public Car(int seriesNumber, String manufacturer, String manufactureDate, String acquisitionDate,
            String acquisitionCos, int salePrice, Condition condition) {
        this.seriesNumber = seriesNumber;
        this.manufacturer = manufacturer;
        this.manufactureDate = manufactureDate;
        this.acquisitionDate = acquisitionDate;
        this.acquisitionCos = acquisitionCos;
        this.salePrice = salePrice;
        this.condition = condition;
    }

    @Override
    public String toString() {
        ArrayList<String> carDetails = new ArrayList<>();
        carDetails.add(this.manufacturer);
        carDetails.add(this.manufactureDate);
        carDetails.add(this.acquisitionCos);
        carDetails.add(this.acquisitionDate);
        carDetails.add(Integer.toString(this.seriesNumber));
        carDetails.add(Integer.toString(this.salePrice));
        carDetails.add(this.condition.toString());
        return carDetails.toString();
    }

    public boolean isBad() {
        return this.condition == Condition.BAD;
    }

    public void discountPrice(Double discount) {
        this.salePrice *= (1 - discount);
    }
}
