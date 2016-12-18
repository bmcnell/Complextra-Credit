package complexObjects;

public class Rectangle {

	
	private int width;
	private int height;
	private int area;
	
	public Rectangle(int iWidth, int iHeight) {
		super();
		this.width = iWidth;
		this.height = iHeight;
		area = height * width;
	}

	public int getArea()
	{
		return area;
	}
	
	public double perimeter()
	{
		return (2 * height) + (2 * width);
	}
	
}
