package Color;

public class Color implements Cloneable {
    int red;
    int green;
    int blue;
    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    @Override
    public Color clone() {
        try {
            return (Color) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static class ImpossibleColorException extends Exception {
        public ImpossibleColorException() {
            super("Impossible color value");
        }
    }
}
