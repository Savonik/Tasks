package jc01_2020.Savonik.lesson07.task01;

public class Cylinder extends Shape{
	private double radius;
	private double height;
	
	public Cylinder(double radius, double height){
		this.radius=radius;
		this.height=height;}
		
	@Override
	public double getVolume(){
		return Math.PI*Math.pow(radius,2)*height;
	}
}
