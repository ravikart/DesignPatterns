package designpatterns.demo.chainofresponsibilitypattern;

public class Request {
	
	private PriorityEnum priority;
	
	public Request(PriorityEnum priority){
		this.priority = priority;
	}
	
	public PriorityEnum getPriority() {
		return this.priority;
	}

}
