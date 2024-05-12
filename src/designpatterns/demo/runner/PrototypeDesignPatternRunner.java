package designpatterns.demo.runner;

import designpatterns.demo.prototype.Rectangle;

public class PrototypeDesignPatternRunner {
	
//	Imagine you’re working on a drawing application, and 
//	you need to create and manipulate various shapes. Each shape 
//	might have different attributes like color or size. Creating 
//	a new shape class for every variation becomes cumbersome. 
//	Also, dynamically adding or removing shapes during runtime can be challenging.

	public static void main(String[] args) {
		
		Rectangle originalObject = new Rectangle(10,20,"red");
		
		originalObject.draw();
		
		Rectangle clonedObject = (Rectangle) originalObject.clone();
		clonedObject.setColor("blue");
		
		System.out.println("Original Object");
		System.out.println(originalObject);
		
		System.out.println("Cloned Object");
		System.out.println(clonedObject);
		
		
	}
}
