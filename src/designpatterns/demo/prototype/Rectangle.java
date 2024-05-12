package designpatterns.demo.prototype;

public class Rectangle implements Shape{
	
	private int width;
	
	private int height;
	
	private String color;
	
	public Rectangle(int width,int height,String color){
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void draw() {
		System.out.println("Draw Rectangle");
	}
	
	@Override
	public Shape clone() {
		return new Rectangle(this.width,this.height,this.color);
	}
	
	@Override
	public String toString() {
		return "Width: " + this.width + ", Height: " + this.height + ",Color: " + this.color;
	}
	
}
