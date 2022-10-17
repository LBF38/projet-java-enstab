package depot_voiture_occasion;

import java.util.ArrayList;
import java.util.List;

import depot_voiture_occasion.Car.Condition;

public class App {
    public static void main(String[] args) {
        List<Car> inventory = new ArrayList<>();
        inventory.add(new Car(26,"Peugeot","10/12/2001","15/01/2002","test",50000,Condition.GOOD));
    }
}
