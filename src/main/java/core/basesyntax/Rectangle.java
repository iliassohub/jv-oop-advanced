package core.basesyntax;

import java.util.Locale;

public class Rectangle extends Figure implements Area {
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        String area = String.format(Locale.US, "%.1f", getArea());
        System.out.println(
                String.format(
                        "Figure: rectangle, area: %s sq. units, width: %s units, height: %s units, color: %s",
                        area, width, height, color
                )
        );
    }
}
