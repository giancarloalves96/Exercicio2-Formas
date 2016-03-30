public class Square extends Shape {
	private int side;
	Square(String sname){
		super(sname);
		side=3;
	}
	public float calculateArea(){
		int area;
		area=side*side;
		return area;
	}
}
