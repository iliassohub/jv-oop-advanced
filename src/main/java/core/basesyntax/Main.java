package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figuresSupplier = new FigureSupplier();
        int size = 6;
        Figure[] figures = new Figure[size];
        for (int i = 0; i < size / 2; i++) {
            figures[i] = figuresSupplier.getRandomFigure();
            figures[i].draw();
        }
        for (int j = size / 2; j < size; j++) {
            figures[j] = figuresSupplier.getDefaultFigure();
            figures[j].draw();
        }
    }
}
