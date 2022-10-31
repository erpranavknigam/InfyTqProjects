package infyTqProjectTwelve;

public class Triangle{
	private Point point1, point2, point3;
	
	public Triangle() {
		point1 = new Point(0,0);
		point2 = new Point(1,1);
		point3 = new Point(2,5);
	}
	
	public Triangle(double point1XCoordinate, double point1YCoordinate
			, double point2XCoordinate, double point2YCoordinate
			, double point3XCoordinate, double point3YCoordinate) {
		
		this.point1 = new Point(point1XCoordinate, point1YCoordinate);
		this.point2 = new Point(point2XCoordinate, point2YCoordinate);
		this.point3 = new Point(point3XCoordinate, point3YCoordinate);
	}
	
	public Triangle(Point point1, Point point2, Point point3) {
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
	}

	public Point getPoint1() {
		return point1;
	}

	public void setPoint1(Point point1) {
		this.point1 = point1;
	}

	public Point getPoint2() {
		return point2;
	}

	public void setPoint2(Point point2) {
		this.point2 = point2;
	}

	public Point getPoint3() {
		return point3;
	}

	public void setPoint3(Point point3) {
		this.point3 = point3;
	}
	
	public double calculatePerimeter() {
		double a = Math.sqrt(Math.pow(point3.getPointXCoordinate() - point1.getPointXCoordinate(),2) + Math.pow(point3.getPointYCoordinate() - point1.getPointYCoordinate(),2));
		double b = Math.sqrt(Math.pow(point3.getPointXCoordinate() - point2.getPointXCoordinate(),2) + Math.pow(point3.getPointYCoordinate() - point2.getPointYCoordinate(),2));
		double c = Math.sqrt(Math.pow(point2.getPointXCoordinate() - point1.getPointXCoordinate(),2) + Math.pow(point2.getPointYCoordinate() - point1.getPointYCoordinate(),2));
		double peri = Math.round((a + b + c) * 100.0) / 100.0;
		
		return peri;
	}
	
	public double calculateArea() {
		double a = Math.sqrt(Math.pow(point3.getPointXCoordinate() - point1.getPointXCoordinate(),2) + Math.pow(point3.getPointYCoordinate() - point1.getPointYCoordinate(),2));
		double b = Math.sqrt(Math.pow(point3.getPointXCoordinate() - point2.getPointXCoordinate(),2) + Math.pow(point3.getPointYCoordinate() - point2.getPointYCoordinate(),2));
		double c = Math.sqrt(Math.pow(point2.getPointXCoordinate() - point1.getPointXCoordinate(),2) + Math.pow(point2.getPointYCoordinate() - point1.getPointYCoordinate(),2));
		double s = (a + b + c) / 2;
		return Math.round(Math.sqrt(s * (s - a) * (s - b) * (s - c))*100.0)/100.0 ;
	}
	
}
