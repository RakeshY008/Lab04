public class Task {
	public double calculateAreaOfTriangleWith3Sides(double side1, double side2, double side3)
	{
		double s = (side1+side2+side3)/2;
		double Area = Math.sqrt(s(s - side1)(s - side2)(s - side3) )
		return Area;
	}
}