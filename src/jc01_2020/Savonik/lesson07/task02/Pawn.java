package jc01_2020.Savonik.lesson07.task02;

public class Pawn extends Figure{
    public Pawn(char vertical, int horizontal) {
        super(vertical, horizontal);
    }

    @Override
    public boolean moveTo(char toVertical, int toHorizontal) {
        return false;
    }
}
