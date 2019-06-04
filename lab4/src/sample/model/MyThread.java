package sample.model;

public class MyThread extends Thread{
    private Feeder feeder;
    public MyThread(Feeder feeder){
        this.feeder = feeder;
    }
    @Override
    public void run() {
        Animal animal = new Animal();
        System.out.println("Получаем запрос к кормушке");
        if(feeder.getAnimalCount() < 3) {
            animal.eat(feeder);
            animal.quit(feeder);
        }
        else{
            System.out.println("Не получил доступ");
        }
    }
}
