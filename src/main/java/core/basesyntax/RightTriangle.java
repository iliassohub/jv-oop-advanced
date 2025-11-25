package core.basesyntax;

import java.util.Locale;

public class RightTriangle extends Figure implements Area {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        String area = String.format(Locale.US, "%.1f", getArea());
        System.out.println("Figure: right triangle, " + "area: " + area + " sq. units, " + "first leg: " + firstLeg + " units" + ", second leg: " + secondLeg + " units," + " color: " + color);
    }
}
