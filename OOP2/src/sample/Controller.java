package sample;

import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import sample.Shapes.*;

public class Controller {
    @FXML
    public Button button_point;
    @FXML
    public Group group;
    @FXML
    public Pane main;
    @FXML
    private Button button_line;
    @FXML
    private Button button_square;
    @FXML
    private Button button_rectangle;
    @FXML
    private Button button_circle;
    @FXML
    private Button button_ellipse;
    @FXML
    private Button button_triangle;

    Drawable shape = new Line();
    int XStart, XEnd, YStart, YEnd;
    boolean isNewShape = true;
    @FXML
    void initialize() {
        button_line.setOnAction(event ->
                shape = new Line());
        button_square.setOnAction(event ->
                shape = new Square());
        button_rectangle.setOnAction(event ->
                shape = new Rectangle());
        button_ellipse.setOnAction(event ->
                shape = new Ellipse());
        button_circle.setOnAction(event ->
                shape = new Circle());
        button_triangle.setOnAction(event ->
                shape = new Triangle());
        main.setOnMousePressed(event -> {
            XStart = (int) ((int) event.getX() - button_line.getWidth());
            YStart = (int) event.getY();
            isNewShape = true;
        });

        main.setOnMouseDragged(event -> {
            XEnd = (int) ((int) event.getX() - button_line.getWidth());
            YEnd = (int) event.getY();
            if (!isNewShape) {
                shape.remove(group);
            } else isNewShape = false;
            shape.getSizesFromRect(XStart, YStart, XEnd, YEnd);
            shape.draw(group);
        });
        Main.mainStage.show();
    }
}
