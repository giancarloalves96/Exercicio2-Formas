public class Triangle extends Shape{
	private int side;
	Triangle(String tname){
		super(tname);
		side=3;
	}
	public float calculateArea(){
		float area;
		area = (float)(1.73*(side*side)/4);
		return area;
	}
}
