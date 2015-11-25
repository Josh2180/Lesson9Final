
import TurtleGraphics.Pen;

public abstract class AbstractShape implements Shape {

    protected double xpos, ypos;

    public AbstractShape() {
        xpos = 0;
        ypos = 0;
    }

    public AbstractShape(double x, double y) {
        xpos = x;
        ypos = y;
    }

    @Override
    public abstract double area();
    
    @Override
    public abstract double perimeter();

    @Override
    public abstract void draw(Pen p);

    @Override
    public final double getXPos() {
        return xpos;
    }

    @Override
    public final  double getYPos() {
        return ypos;
    }

    @Override
    public void move(double x, double y) {
        xpos = x;
        ypos = y;
    }

    @Override
    public abstract void stretchBy(double factor);

    public String toString() {
        String str = "X-Y Position= " + xpos + ", " + ypos;
        str += "\nArea= " + area();
        str += "\nPerimeter= " + perimeter();
        return str;
    }

}
