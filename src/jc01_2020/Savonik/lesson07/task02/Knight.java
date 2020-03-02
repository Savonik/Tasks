package jc01_2020.Savonik.lesson07.task02;

public class Knight extends Figure {
    public Knight(char vertical, int horizontal) {
        super(vertical, horizontal);
    }

    @Override
    public boolean moveTo(char toVertical, int toHorizontal) {
        if (toHorizontal==horizontal&&toVertical==vertical) return false;
        else return ((Math.abs(toVertical - vertical) == 1 && Math.abs(toHorizontal - horizontal) == 2) ||
                (Math.abs(toVertical - vertical) == 2 && Math.abs(toHorizontal - horizontal) == 1) && 
                        toVertical >= 'a' && toVertical <= 'h' && toHorizontal >= 1 && toHorizontal <= 8);
    }
}
