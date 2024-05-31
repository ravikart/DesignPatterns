package designpatterns.demo.chainofresponsibilitypattern;

public interface SupportHandler {
	
	public void handleRequest(Request request);

	public void setNextSupportHandler(SupportHandler level2Handler);

}
