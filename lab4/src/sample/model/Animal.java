package sample.model;

import sample.Controller;

public class Animal{
    public void eat(Feeder feeder){
        System.out.println("Получил доступ к кормушке");
        feeder.setAnimalCount(feeder.getAnimalCount() + 1);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void quit(Feeder feeder){
        System.out.println("Ушел от кормушки");
        if(feeder.getAnimalCount() > 0){
            feeder.setAnimalCount(feeder.getAnimalCount() - 1);
        }

    }
}
