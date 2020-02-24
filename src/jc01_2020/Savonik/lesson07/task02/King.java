package jc01_2020.Savonik.lesson07.task02;

public class King extends Figure {
    public King(char vertical, int horizontal) {
        super(vertical, horizontal);
    }

    @Override
    public boolean moveTo(char toVertical, int toHorizontal) {
        return (Math.abs(toVertical - vertical) <= 1 && Math.abs(toHorizontal - horizontal) <= 1 &&
                toVertical >= 'a' && toVertical <= 'h' && toHorizontal >= 1 && toHorizontal <= 8);
    }
}
