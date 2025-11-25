package core.basesyntax;

import java.util.Locale;

public class Circle extends Figure implements Area {
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
        System.out.println(
                String.format(
                        "Figure: circle, area: %s sq. units, radius: %s units, color: %s",
                        area, radius, color
                )
        );
    }
}
