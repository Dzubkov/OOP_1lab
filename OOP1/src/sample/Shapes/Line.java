package sample.Shapes;

import javafx.scene.Group;
import javafx.scene.Node;

public class Line implements Drawable{
    Point pointStart, pointEnd;

    public Line(){};

    public Line(int x1, int y1, int x2, int y2) {
        pointEnd = new Point(x2, y2);
        pointStart = new Point(x1, y1);
    }
    @Override
    public void getSizesFromRect(int x1, int y1, int x2, int y2) {
        pointEnd = new Point(x2, y2);
        pointStart = new Point(x1, y1);
    }

    @Override
    public void draw(Group group) {
        javafx.scene.shape.Line line = new javafx.scene.shape.Line(pointStart.x, pointStart.y, pointEnd.x, pointEnd.y);
        group.getChildren().add(line);
    }

}
