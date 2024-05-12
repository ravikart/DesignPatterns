package designpatterns.demo.prototype;

public class Circle implements Shape{
	
	private int radius;
	
	private String color;
	
	public Circle(int radius,String color) {
		this.color = color;
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		System.out.println("Draw Circle");
	}
	
	@Override
	public Shape clone() {
		return new Circle(this.radius,this.color);
	}
	
	@Override
	public String toString() {
		return "Radius: " + this.radius + ",Color: " + this.color;
	}

}
