package sample.model;

import sample.Controller;

public class Feeder {
    private int animalCount;
    public void setAnimalCount(int animalCount) {
        this.animalCount = animalCount;
    }

    public int getAnimalCount() {
        //System.out.println("Животных у кормушки было: " + animalCount);
        return animalCount;
    }

}
