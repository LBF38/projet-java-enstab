package depot_voiture_occasion;

import java.util.ArrayList;
import java.util.List;

import depot_voiture_occasion.Car.*;

public class App {
    public static void main(String[] args) {
        List<Car> inventory = new ArrayList<>();
        inventory.add(new Car(1, "Peugeot",
                "10/12/2001", "15/01/2002",
                "test", 50000, Condition.BAD));
        inventory.add(new Car(2, "Citroen",
                "10/12/2001", "15/01/2002",
                "test", 100000, Condition.GOOD));
        inventory.add(new Car(3, "Renault",
                "10/12/2001", "15/01/2002",
                "test", 150000, Condition.GOOD));
        inventory.add(new Car(4, "Volswagen",
                "10/12/2001", "15/01/2002",
                "test", 250000, Condition.BAD));
        inventory.add(new Car(5, "Tesla",
                "07/12/2021", "15/01/2022",
                "test", 75000, Condition.AVERAGE));
        inventory.add(new Car(6, "Mercedes",
                "10/12/2021", "15/01/2022",
                "test", 500000, Condition.BAD));
        for (Car car : inventory) {
            if (car.isBad()) {
                car.discountPrice(0.1);
            }
            System.out.println(car);
        }
    }
}
