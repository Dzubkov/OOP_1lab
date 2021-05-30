package sample.Shapes;

import javafx.scene.Group;

public class Polygon implements Drawable{
    int angels;
    Point[] points;

    public Polygon(int angels){
        this.angels = angels;
        points = new Point[angels];
    }
    @Override
    public void draw(Group group){
        for(int i = 1; i < angels; i++){
            Line line = new Line(points[i-1].x, points[i-1].y, points[i].x, points[i].y);
            line.draw(group);
        }
        Line line = new Line(points[angels - 1].x, points[angels -1].y, points[0].x, points[0].y);
        line.draw(group);
    }
    @Override
    public void getSizesFromRect(int x1, int y1, int x2, int y2){
    }
}
