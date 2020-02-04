package lec8.ex1;

public interface Point {
	
	final public static double POINT_EPSILON = 0.0001;

	double getX();
	double getY();
	
	default double distanceTo(Point other) {
		return Math.sqrt((getX() - other.getX())*(getX() - other.getX()) +
				         (getY() - other.getY())*(getY() - other.getY()));
	}

	default boolean equals(Point other) {
		boolean x_close_enough = (Math.abs(getX() - other.getX()) < POINT_EPSILON);
		boolean y_close_enough = (Math.abs(getY() - other.getY()) < POINT_EPSILON);
		
		return (x_close_enough && y_close_enough);
	}
}
