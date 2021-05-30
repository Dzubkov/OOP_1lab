package sample.Shapes;

public class Rectangle extends Square{
    int height;
    public Rectangle(){
        angels = 4;
    }

    public Rectangle(int width, int height, int x, int y){
        super();
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
        points[0] = new Point(x, y);
        points[1] = new Point(x + width, y);
        points[2] = new Point(x + width, y + height);
        points[3] = new Point(x, y + height);
    }

    @Override
    public void getSizesFromRect(int x1, int y1, int x2, int y2){
        width = Math.abs(x1-x2);
        height = Math.abs(y1-y2);
        x = x1;
        y = y1;
        points[0] = new Point(x, y);
        points[1] = new Point(x + width, y);
        points[2] = new Point(x + width, y + height);
        points[3] = new Point(x, y + height);
    }
}
