package core.basesyntax;

public class ColorSupplier {
    public String getRandomColor() {

        String[] randomColors = {"red", "blue", "green", "yellow", "white", "black"};
        int randomNumber = (int) (Math.random() * randomColors.length);

        return randomColors[randomNumber];
    }
}
