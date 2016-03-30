public class Circle extends Shape {
	private int radius;
	
	Circle(String cname){
		super(cname);
		radius=3;
	}
	public float calculateArea(){
		float area;
		area = (float)(3.14*radius*radius);
		return area;
	}
}
