package sample.Shapes;

public class Square extends Polygon {
    int width, x, y;

    public Square() {
        super(4);
    }

    public Square(int width, int x, int y) {
        super(4);
        this.width = width;
        this.x = x;
        this.y = y;
        points[0] = new Point1(x, y);
        points[1] = new Point1(x + width, y);
        points[2] = new Point1(x + width, y + width);
        points[3] = new Point1(x, y + width);
    }

    @Override
    public void getSizesFromRect(int x1, int y1, int x2, int y2) {
        int deltaX = x2 - x1;
        int deltaY = y2 - y1;
//        if(Math.abs(deltaX) < Math.abs(deltaY)){
            width = deltaX;
//        } else {
//            width = deltaY;
//        }

        x = x1;
        y = y1;
        if (deltaY < 0 && deltaX < 0){
            points[0] = new Point1(x1, y1);
            points[1] = new Point1(x1 + width, y1);
            points[2] = new Point1(x1 + width, y1 + width);
            points[3] = new Point1(x1, y1 + width);
        } else if (deltaY < 0 && deltaX > 0 && width == deltaY){
            points[0] = new Point1(x1, y1);
            points[1] = new Point1(x1 + width, y1);
            points[2] = new Point1(x1 + width, y1 - width);
            points[3] = new Point1(x1, y1 - width);
        } else if (deltaY > 0 && deltaX >= 0){
            points[0] = new Point1(x1, y1);
            points[1] = new Point1(x1 + width, y1);
            points[2] = new Point1(x1 + width, y1 + width);
            points[3] = new Point1(x1, y1 + width);
        }else{
            points[0] = new Point1(x1, y1);
            points[1] = new Point1(x1 + width, y1);
            points[2] = new Point1(x1 + width, y1 - width);
            points[3] = new Point1(x1, y1 - width);
        }
    }
}
