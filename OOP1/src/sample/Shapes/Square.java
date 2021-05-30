package sample.Shapes;

public class Square extends Polygon{
    int width, x, y;
    public Square() {
        super(4);
    }

    public Square(int width, int x, int y) {
        super(4);
        this.width = width;
        this.x = x;
        this.y = y;
        points[0] = new Point(x, y);
        points[1] = new Point(x + width, y);
        points[2] = new Point(x + width, y + width);
        points[3] = new Point(x, y + width);
    }
    @Override
    public void getSizesFromRect(int x1, int y1, int x2, int y2){
        width = Math.min(Math.abs(x1-x2),Math.abs(y1-y2));
        x = x1;
        y = y1;
        points[0] = new Point(x1, y1);
        points[1] = new Point(x1 + width, y1);
        points[2] = new Point(x1 + width, y2 + width);
        points[3] = new Point(x1, y2 + width);
    }
}
