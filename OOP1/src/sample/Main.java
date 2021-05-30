package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.Shapes.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group group = new Group();
        Circle circle = new Circle(40, 100, 100);
        circle.draw(group);
        Ellipse ellipse = new Ellipse(20, 40, 200, 100);
        ellipse.draw(group);
        Line line = new Line(240, 60, 260, 140);
        line.draw(group);
        Square square = new Square(100, 280, 60);
        square.draw(group);
        Rectangle rectangle = new Rectangle(200, 100, 400, 60);
        rectangle.draw(group);
        Triangle triangle = new Triangle();
        triangle.getSizesFromRect(100, 300, 200, 400);
        triangle.draw(group);
        primaryStage.setTitle("OOP-Lab1");
        primaryStage.setScene(new Scene(group, 800, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
