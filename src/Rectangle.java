
import TurtleGraphics.Pen;

public class Rectangle extends AbstractShape {

    private double width, height;

    public Rectangle() {
        super();
        width = 1;
        height = 1;
    }

    public Rectangle(double x, double y, double w, double h) {
        super(x, y);
        width = w;
        height = h;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public void draw(Pen p) {
        p.up();
        p.move(xpos - (width / 2), ypos + (height / 2));
        p.down();
        p.setDirection(0);
        for (int i = 0; i < 2; i++) {
            p.move(width);
            p.turn(-90);
            p.move(height);
            p.turn(-90);
        }
    }

    @Override
    public void stretchBy(double factor) {
        width *= factor;
        height *= factor;
    }

    @Override
    public String toString() {
        String result = "This is a rectangle\n";
        result += "Width = " + width + "\tHeight = " + height;
        result += "\n" + super.toString();
        return result;
    }

    @Override
    public double perimeter() {
        return (2 * width) + (2 * height);
    }
}
