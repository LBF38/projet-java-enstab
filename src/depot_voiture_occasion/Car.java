package depot_voiture_occasion;

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

}
