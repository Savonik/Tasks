package jc01_2020.Savonik.lesson07.task01;

public class Box{
    
    double length, width, height, volumebox;
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public Box (int volumeBox){
     this.volumebox=volumeBox;   
    }
    
    public boolean add (Shape shape){
        this.volumebox -= shape.getVolume();
        return volumebox > 0;
    }
    
}
