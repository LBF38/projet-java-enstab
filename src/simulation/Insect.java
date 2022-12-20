package simulation;

public class Insect {
    private int abscissa;
    private int ordinate;
    protected int hunger;
    protected int lastMeal;

    public Insect(int abscissa, int ordinate) {
        this.abscissa = abscissa;
        this.ordinate = ordinate;
        this.hunger = 0;
        this.lastMeal = 0;
    }

    public int getAbscissa() {
        return this.abscissa;
    }

    public void setAbscissa(int abscissa) {
        this.abscissa = abscissa;
    }

    public int getOrdinate() {
        return this.ordinate;
    }

    public void setOrdinate(int ordinate) {
        this.ordinate = ordinate;
    }

    public int getHunger() {
        return this.hunger;
    }

    public void setHunger(int hunger) {
        if(hunger < 0)
            this.hunger = 0;
        else
            this.hunger = hunger;
    }

    public int getLastMeal() {
        return this.lastMeal;
    }

    public void setLastMeal(int lastMeal) {
        this.lastMeal = lastMeal;
    }
}