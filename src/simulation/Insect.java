package simulation;

public class Insect {
    private int abscissa;
    private int ordinate;
    protected int hunger;
    protected int lastMeal;

    public Insect(int abscissa, int ordinate, int hunger) {
        this.abscissa = abscissa;
        this.ordinate = ordinate;
        this.hunger = hunger;
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
        if (hunger < 0)
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

    @Override
    public String toString() {
        return "Insect [abscissa=" + abscissa + ", ordinate=" + ordinate + ", hunger=" + hunger + ", lastMeal="
                + lastMeal
                + "]";
    }

    public void eat() {
        this.lastMeal += 1;
        if (this.lastMeal == this.hunger) {
            System.out.println("I'm hungry!");
            this.setLastMeal(0);
        }
    }
}