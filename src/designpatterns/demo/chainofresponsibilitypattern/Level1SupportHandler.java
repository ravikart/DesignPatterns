package designpatterns.demo.chainofresponsibilitypattern;

public class Level1SupportHandler implements SupportHandler{
	
	private SupportHandler supportHandler;
	
	@Override
	public void setNextSupportHandler(SupportHandler supportHandler) {
		this.supportHandler = supportHandler;
	}

	@Override
	public void handleRequest(Request request) {
		if(request.getPriority() == PriorityEnum.LOW) {
			System.out.println("Low Priority is handled by Level 1 Support Handler");
		}else {
			this.supportHandler.handleRequest(request);
		}
	}

}
