package core.basesyntax;

import java.util.Locale;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public void draw() {
        String area = String.format(Locale.US, "%.1f", getArea());
        System.out.println("Figure: circle, " + "area: " + area + " sq. units, " + "radius: " + radius + " units, " + "color: " + color);
    }
}
