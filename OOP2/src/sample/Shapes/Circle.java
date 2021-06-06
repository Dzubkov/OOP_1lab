package sample.Shapes;

import javafx.scene.Group;
import javafx.scene.paint.Color;

public class Circle implements Drawable {
    int r, x, y;
    javafx.scene.shape.Circle circle;

    public Circle() { }

    public Circle(int r, int x, int y) {
        this.r = r;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Group group) {
        circle = new javafx.scene.shape.Circle(x, y, r);
        circle.setFill(Color.TRANSPARENT);
        circle.setStrokeWidth(1);
        circle.setStroke(Color.BLACK);
        group.getChildren().add(circle);
    }

    @Override
    public void getSizesFromRect(int x1, int y1, int x2, int y2) {
        r = Math.min(Math.abs(x1-x2),Math.abs(y1-y2));
        x = x1;
        y = y1;
    }
    @Override
    public void remove(Group group){
        group.getChildren().remove(circle);
    }

}
