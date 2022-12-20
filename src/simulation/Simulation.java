package simulation;

import java.util.ArrayList;
import java.util.Random;

public class Simulation {
    protected ArrayList<Insect> insects;
    protected int nbRounds;
    public Random rand;

    public Simulation(int nbInsects, int nbRounds) {
        this.insects = new ArrayList<Insect>();
        this.nbRounds = nbRounds;
        this.rand = new Random();

        for (int i = 0; i < nbInsects; i++) {
            this.insects.add(new Insect(this.rand.nextInt(100), this.rand.nextInt(100), this.rand.nextInt(10) + 1));
        }
    }

    public void simulate() {
        System.out.println("Simulation started");
        for (int i = 0; i < this.nbRounds; i++) {
            System.out.println("\nRound " + i);
            for (Insect insect : this.insects) {
                System.out.println(insect);
                insect.eat();
            }
        }
    }

    public static void main(String[] args) {
        Simulation simulation = new Simulation(10, 10);
        simulation.simulate();
    }
}
