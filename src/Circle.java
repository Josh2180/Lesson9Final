
import TurtleGraphics.Pen;

public class Circle extends AbstractShape {

    protected double radius;

    public Circle() {
        super();
        radius = 1;
    }

    public Circle(double x, double y, double r) {
        super(x, y);
        radius = r;
    }

    @Override
    public double area() {
        return (radius * radius) * Math.PI;
    }

    @Override
    public void draw(Pen p) {
        double side = 2 * Math.PI * radius / 3600;
        p.up();
        p.move((xpos + radius / 10) + ((radius) - radius / 10), ypos - side / 2.0);
        p.setDirection(90);
        p.down();

        for (int i = 0; i < 3600; i++) {
            p.move(side);
            p.turn(0.1);
        }
    }

    @Override
    public void stretchBy(double factor) {
        radius *= factor;
    }

    @Override
    public String toString() {
        String result = "This is a circle\n";
        result += "Radius = " + radius;
        result += "\n" + super.toString();
        return result;
    }
    
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

}
