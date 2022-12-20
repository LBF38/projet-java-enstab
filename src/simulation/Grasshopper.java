package simulation;

public class Grasshopper extends Insect {
    public Grasshopper(int abscissa, int ordinate) {
        super(abscissa, ordinate, 3);
    }

    @Override
    public String toString() {
        return "I'm a Grasshopper : " +  super.toString();
    }
}
