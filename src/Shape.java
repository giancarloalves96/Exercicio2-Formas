
public class Shape {
	private String name;
	Shape(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public float calculateArea(){
		return 0.0f;
	}
	public static void main(String[] args) {
		Circle c = new Circle("Circle c", 1);
		Square s = new Square("Square s", 1);
		Triangle t = new Triangle("Triangle t", 1);
		Shape shapeArray[]={c, s, t};
		for(int i=0; i<shapeArray.length; i++){
			System.out.println("The area of "+shapeArray[i].getName()+" is "+shapeArray[i].calculateArea()+" sq. cm. \n");
		}
	}
}
