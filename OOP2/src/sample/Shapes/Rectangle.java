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
        points[0] = new Point1(x, y);
        points[1] = new Point1(x + width, y);
        points[2] = new Point1(x + width, y + height);
        points[3] = new Point1(x, y + height);
    }

    @Override
    public void getSizesFromRect(int x1, int y1, int x2, int y2){
        width = x2 - x1;
        height = y2 - y1;
        x = x1;
        y = y1;
        points[0] = new Point1(x, y);
        points[1] = new Point1(x + width, y);
        points[2] = new Point1(x + width, y + height);
        points[3] = new Point1(x, y + height);
    }
}
