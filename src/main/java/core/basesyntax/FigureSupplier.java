package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

     public static final String DEFAULT_COLOR = "white";
     public static final int DEFAULT_SIZE = 10;


    public Figure getRandomFigure() {
        ColorSupplier randomColor = new ColorSupplier();
        String color = randomColor.getRandomColor();
        Random random = new Random();

        int randomNumber = random.nextInt(5);
        switch (randomNumber) {
            case 0:
                return new Circle(color, random.nextInt(50) + 1);
            case 1:
                return new Square(color, random.nextInt(50) + 1);
            case 2:
                return new Rectangle(color, random.nextInt(50) + 1, random.nextInt(50) + 1);
            case 3:
                return new RightTriangle(color, random.nextInt(50) + 1, random.nextInt(50) + 1);
            case 4:
                return new IsoscelesTrapezoid(color, random.nextInt(50) + 1, random.nextInt(50) + 1, random.nextInt(50) + 1);
        }

        return getDefaultFigure();
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_SIZE);

    }
}
