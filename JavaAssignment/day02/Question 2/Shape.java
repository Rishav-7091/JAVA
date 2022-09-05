package day02;

public class Shape {
	int length;
	int width;
	int height;
	Shape(int length,int width,int height){
		this.length=length;
		this.width=width;
		this.height=height;
	}
		public int calArea() {
			return 0;
			
		}
		public static void main (String args[]) {
			Shape rect = new Rectangle(10,20,30);
			Shape sqa = new Square(10,20,30);
			Shape tri = new Triangle(10,20,30);
			
			System.out.println("Area of rectangle"+rect.calArea());
			System.out.println("Area of square"+sqa.calArea());
			System.out.println("Area of Triangle"+tri.calArea());
			
		}
}
