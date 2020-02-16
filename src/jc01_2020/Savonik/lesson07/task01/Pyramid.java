package jc01_2020.Savonik.lesson07.task01;

public class Pyramid extends Shape {

	private double side;
	private double height;
	
	public Pyramid(double side, double height){
		this.side=side;
		this.height=height;
	}

	@Override
	public double getVolume() {
		return height*Math.pow(side,2)/4/Math.pow(3,1/3d);
	}
}
