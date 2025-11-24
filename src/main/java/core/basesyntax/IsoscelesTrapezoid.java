package core.basesyntax;

import java.util.Locale;

public class IsoscelesTrapezoid extends Figure {
    private int base1;
    private int base2;
    private int height;

    public IsoscelesTrapezoid(String color, int base1, int base2, int height){
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
        System.out.println("Figure: isosceles trapezoid, " + "area: " + area + " sq. units, " + "base 1: " + base1 + " units," + " base 2: " + base2 +" units," + " height: " + height + " units," + " color: " + color);
    }
}
