public class Circle extends Shape {
	private int radius;
	
	Circle(String cname, int radius){
		super(cname);
		this.radius=radius;
	}
	public float calculateArea(){
		float area;
		area = (float)(3.14*radius*radius);
		return area;
	}
}
