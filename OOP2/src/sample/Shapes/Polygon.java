package sample.Shapes;

import javafx.scene.Group;

public class Polygon implements Drawable {
    int angels;
    Line[] line;
    Point1[] points;


    public Polygon(int angels) {
        this.angels = angels;
        points = new Point1[angels];
        line = new Line[angels];

    }

    @Override
    public void draw(Group group) {
        for (int i = 1; i < angels; i++) {
             line[i] = new Line(points[i - 1].x, points[i - 1].y, points[i].x, points[i].y);
            line[i].draw(group);
        }
        line[0] = new Line(points[angels - 1].x, points[angels - 1].y, points[0].x, points[0].y);
        line[0].draw(group);
    }

    @Override
    public void getSizesFromRect(int x1, int y1, int x2, int y2) {
    }

    @Override
    public void remove(Group group) {
        for (int i = 0; i < angels; i++) {
            line[i].remove(group);
        }
    }
}
