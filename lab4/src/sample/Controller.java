package sample;

import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import sample.model.Feeder;
import sample.model.MyThread;

public class Controller {
    private Feeder feeder = new Feeder();
    @FXML
    private Label AnimalLabel;

    public Controller(){
    }

    @FXML
    private void initialize() {

    }
    public void addThread(){
        System.out.println("Запускаем поток");
        MyThread thread = new MyThread(feeder);
        new Thread(thread).start();
        AnimalLabel.setText("Животных: " + (feeder.getAnimalCount() + 1));
    }
}
