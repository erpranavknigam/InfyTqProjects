package infyTqProjectTwelve;

public class Point {
	private double pointXCoordinate, pointYCoordinate;
	
	public Point(double point1xCoordinate, double point1yCoordinate) {
		// TODO Auto-generated constructor stub
		this.pointXCoordinate = point1xCoordinate;
		this.pointYCoordinate = point1yCoordinate;
	}

	public double getPointXCoordinate() {
		return pointXCoordinate;
	}

	public void setPointXCoordinate(double pointXCoordinate) {
		this.pointXCoordinate = pointXCoordinate;
	}

	public double getPointYCoordinate() {
		return pointYCoordinate;
	}

	public void setPointYCoordinate(double pointYCoordinate) {
		this.pointYCoordinate = pointYCoordinate;
	}
	
	public String toString(){
        return "Point\nxCoordinate: "+this.getPointXCoordinate()+"\nyCoordinate: "+this.getPointYCoordinate();
    }
}
