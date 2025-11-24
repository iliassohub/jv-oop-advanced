package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figuresSupplier = new FigureSupplier();
        int SIZE = 6;
        Figure[] figures = new Figure[SIZE];
        for (int i = 0; i < SIZE / 2; i++) {
            figures[i] = figuresSupplier.getRandomFigure();
            figures[i].draw();
        }
        for (int j = SIZE / 2; j < SIZE; j++) {
            figures[j] = figuresSupplier.getDefaultFigure();
            figures[j].draw();
        }
    }
}
