package Factory_Pattern;

public class MainClass {
	public static void main(String args[]) {
	ShapeFactory shapefactoryObj = new ShapeFactory();
	Shape shapeObj = shapefactoryObj.getShape("CIRCLE");
	Shape shapeObj2 = shapefactoryObj.getShape("CIRCL");

	shapeObj.draw();
	if(shapeObj2==null)
		System.out.println("Wrong");
	else
		shapeObj2.draw();
	}
}
