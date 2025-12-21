package firstProject;

import java.util.ArrayList;

public class AnimalPredators {

    public static void main(String[] args) {
    	System.out.println("Compiled By Muhammad Kaif Shamim!");


        ArrayList<Animal_I> animals = new ArrayList<>();
        animals.add(new Wolf());
        animals.add(new Fox());
        animals.add(new Fox());

        for (Animal_I animal : animals) {
            animal.move();
        }

        ArrayList<Predator> predators = new ArrayList<>();
        predators.add(new Wolf());
        predators.add(new Fox());
        predators.add(new Fox());

        for (Predator p : predators) {
            p.hunt();
        }
    }

}
