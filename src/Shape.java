import TurtleGraphics.*;
        
public interface Shape {
    public double area();
    public double perimeter();
    public void draw(Pen p);
    public double getXPos();
    public double getYPos();
    public void move(double x, double y);
    public void stretchBy(double factor);
    @Override
    public String toString();
}
