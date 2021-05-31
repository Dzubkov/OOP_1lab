package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static Stage mainStage;
    public static Scene mainScene;

    @Override
    public void start(Stage primaryStage) throws Exception{
        mainStage = primaryStage;
        Parent parent = FXMLLoader.load(getClass().getResource("sample.fxml"));
        mainScene = new Scene(parent,800,600);
        mainStage.setScene(mainScene);
        mainStage.setTitle("Графический редактор");
        mainStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
