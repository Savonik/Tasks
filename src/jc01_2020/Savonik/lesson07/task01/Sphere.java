package jc01_2020.Savonik.lesson07.task01;

public class Sphere extends Shape {
	private double radius;
	public Sphere(double radius){
		this.radius=radius;
	}

	@Override
	public double getVolume() {
		return (4/3d)*(Math.PI)*(Math.pow(radius,3));
	}
}
