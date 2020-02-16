package jc01_2020.Savonik.lesson07.task01;

public class Parallelepiped extends Shape{
	private double length;
	private double width;
	private double height;
	
    private Parallelepiped(double length, double width, double height){
    this.length=length;
    this.height=height;
    this.width=width;
	}
	@Override
	public double getVolume() {
		return length*width*height;
	}
}
