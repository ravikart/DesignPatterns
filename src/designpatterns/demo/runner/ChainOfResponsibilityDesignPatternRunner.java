package designpatterns.demo.runner;

import designpatterns.demo.chainofresponsibilitypattern.Level1SupportHandler;
import designpatterns.demo.chainofresponsibilitypattern.Level2SupportHandler;
import designpatterns.demo.chainofresponsibilitypattern.Level3SupportHandler;
import designpatterns.demo.chainofresponsibilitypattern.PriorityEnum;
import designpatterns.demo.chainofresponsibilitypattern.Request;
import designpatterns.demo.chainofresponsibilitypattern.SupportHandler;

public class ChainOfResponsibilityDesignPatternRunner {
	
//	Imagine a customer support system where customer requests 
//	need to be handled based on their priority. There are three 
//	levels of support: Level 1, Level 2, and Level 3. Level 1 
//	support handles basic requests, Level 2 support handles more complex requests, 
//	and Level 3 support handles critical issues that cannot be resolved by Level 1 or Level 2.

	public static void main(String[] args) {
		
		SupportHandler level1Handler = new Level1SupportHandler();
		SupportHandler level2Handler = new Level2SupportHandler();
		SupportHandler level3Handler = new Level3SupportHandler();
		
		level1Handler.setNextSupportHandler(level2Handler);
		level2Handler.setNextSupportHandler(level3Handler);
		level3Handler.setNextSupportHandler(level1Handler);
		
		
		Request requestOne = new Request(PriorityEnum.LOW);
		Request requestTwo = new Request(PriorityEnum.HIGH);
		Request requestThree = new Request(PriorityEnum.CRITICAL);
		
		level1Handler.handleRequest(requestOne);
		level1Handler.handleRequest(requestTwo);
		level1Handler.handleRequest(requestThree);
	}

}
