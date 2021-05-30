package sample.Shapes;

import javafx.scene.Group;
import javafx.scene.paint.Color;

public class Ellipse extends Circle{
    private int  r2;

    public Ellipse(){};

    public Ellipse(int r, int r2, int x, int y){
        this.r = r;
        this.r2 = r2;
        this.x = x;
        this.y = y;
    }
    @Override
    public void draw(Group group){
        javafx.scene.shape.Ellipse ellipse = new javafx.scene.shape.Ellipse(x, y, r, r2);
        ellipse.setFill(Color.TRANSPARENT);
        ellipse.setStrokeWidth(1);
        ellipse.setStroke(Color.BLACK);
        group.getChildren().add(ellipse);
    }
    @Override
    public void getSizesFromRect(int x1, int y1, int x2, int y2){
        r = Math.abs(x1-x2);
        r2 = Math.abs(y1-y2);
        x = x1;
        y = y1;
    }
}
