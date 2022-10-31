package infyTqProjectNine;

public class Point {
	private double xCoordinate, yCoordinate;

	public Point(double xCoordinate, double yCoordinate) {
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}

	public double getxCoordinate() {
		return xCoordinate;
	}

	public void setxCoordinate(double xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public double getyCoordinate() {
		return yCoordinate;
	}

	public void setyCoordinate(double yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	
	public String calculateDistance() {
		return String.format("%.2f", Math.sqrt((xCoordinate * xCoordinate) + (yCoordinate * yCoordinate)));
	}
	
	public String calculateDistance(Point p) {
		double val1 = (p.xCoordinate - this.xCoordinate) * (p.xCoordinate - this.xCoordinate);
		double val2 = (p.yCoordinate - this.yCoordinate) * (p.yCoordinate - this.yCoordinate);
		
		return String.format("%.2f",(Math.sqrt(val2 + val1)));
	}
}
