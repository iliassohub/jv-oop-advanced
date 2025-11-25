package core.basesyntax;

import java.util.Locale;

public class Square extends Figure implements Area {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        String area = String.format(Locale.US, "%.1f", getArea());
        System.out.println(
                String.format(
                        "Figure: square, area: %s sq. units, side: %s units, color: %s",
                        area, side, color
                )
        );
    }
}
