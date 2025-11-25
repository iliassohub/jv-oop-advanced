package core.basesyntax;

import java.util.Locale;

public class IsoscelesTrapezoid extends Figure implements Area {
    private int base1;
    private int base2;
    private int height;

    public IsoscelesTrapezoid(String color, int base1, int base2, int height) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((base1 + base2) / 2) * height;
    }

    @Override
    public void draw() {
        String area = String.format(Locale.US, "%.1f", getArea());
        System.out.println(
                String.format(
                        "Figure: isosceles trapezoid, area: %s sq. units, base1: %s units, base2: %s units, height: %s units, color: %s",
                        area, base1, base2, height, color
                )
        );
    }
}
