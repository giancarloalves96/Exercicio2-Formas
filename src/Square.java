public class Square extends Shape {
	private int side;
	Square(String sname, int side){
		super(sname);
		this.side=side;
	}
	public float calculateArea(){
		int area;
		area=side*side;
		return area;
	}
}
