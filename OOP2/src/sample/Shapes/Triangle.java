package sample.Shapes;

public class Triangle extends Polygon{

    public Triangle(){
        super(3);
    }

    @Override
    public void getSizesFromRect(int x1, int y1, int x2, int y2){
        points[0] = new Point1(x1, y1);
        points[1] = new Point1(x2, y2);
        points[2] = new Point1(x1 * 2 - x2 , y2);
    }
}
