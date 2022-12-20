package simulation;

public class Ant extends Insect {
    public Ant(int abscissa, int ordinate) {
        super(abscissa, ordinate, 5);
    }

    @Override
    public String toString() {
        return "I'm an Ant : " + super.toString();
    }
}
