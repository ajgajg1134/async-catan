
public class Road {
	private Point point1;
	private Point point2;
	public Road(Point p1, Point p2)
	{
		point1 = p1;
		point2 = p2;
	}
	public Point[] getPoints()
	{
		Point[] endPoints = new Point[2];
		endPoints[0] = point1;
		endPoints[1] = point2;
		return endPoints;
	}
}
