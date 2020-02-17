package jc01_2020.Savonik.lesson07.task02;

public class Rook extends Figure {
    public Rook(char vertical, int horizontal) {
        super(vertical, horizontal);
    }

    @Override
    public boolean moveTo(char toVertical, int toHorizontal) {
        return false;
    }
}
