package sample.Shapes;

import javafx.scene.Group;

public class Line implements Drawable {
    Point1 pointStart, pointEnd;

    public Line(){};

    public Line(int x1, int y1, int x2, int y2) {
        pointEnd = new Point1(x2, y2);
        pointStart = new Point1(x1, y1);
    }
    @Override
    public void getSizesFromRect(int x1, int y1, int x2, int y2) {
        pointEnd = new Point1(x2, y2);
        pointStart = new Point1(x1, y1);
    }

    javafx.scene.shape.Line line;
    @Override
    public void draw(Group group) {
        line = new javafx.scene.shape.Line(pointStart.x, pointStart.y, pointEnd.x, pointEnd.y);
        group.getChildren().add(line);
    }

    @Override
    public void remove(Group group){
        group.getChildren().remove(line);
    }

}
