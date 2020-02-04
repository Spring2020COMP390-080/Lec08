package lec8.ex1;

public class PolarPoint implements Point {

	private double theta;
	private double r;

	public PolarPoint(double theta, double r) {
		this.theta = theta;
		this.r = r;
	}
	
	public double getX() {
		return (r * Math.cos(theta));
	}

	public double getY() {
		return (r * Math.sin(theta));
	}
}
