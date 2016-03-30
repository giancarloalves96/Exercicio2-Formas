public class Triangle extends Shape{
	private int side;
	Triangle(String tname, int side){
		super(tname);
		this.side=side;
	}
	public float calculateArea(){
		float area;
		area = (float)(1.73*(side*side)/4);
		return area;
	}
}
