package sample;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    Button button;

    @FXML
    @Override
    public void start(Stage primaryStage) throws Exception{
        button = new Button();

       // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("That's Life!");
        //primaryStage.setScene(new Scene(root, 300, 275));

        StackPane layout = new StackPane();
        Scene scene = new Scene(layout, 300, 250);

        primaryStage.setScene(scene);
        layout.getChildren().add(button);
        button.setOnAction(e->{
            System.out.println("HAKDOG");
        });

        button.setText("ENTER");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
