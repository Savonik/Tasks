package jc01_2020.Savonik.lesson12.Task4;

public enum Color {
    RED("Red"),
    WHITE("White"),
    BLUE("Blue"),
    GREEN("Green"),
    GREY("Grey");

    private String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
