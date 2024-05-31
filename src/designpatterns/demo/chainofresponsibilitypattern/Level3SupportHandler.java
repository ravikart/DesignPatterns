package designpatterns.demo.chainofresponsibilitypattern;

public class Level3SupportHandler implements SupportHandler {
	
	private SupportHandler supportHandler;

	@Override
	public void setNextSupportHandler(SupportHandler supportHandler) {
		this.supportHandler = supportHandler;
	}

	@Override
	public void handleRequest(Request request) {
		if(request.getPriority() == PriorityEnum.CRITICAL) {
			System.out.println("Critical Priority is handled by Level 3 Support Handler");
		}else {
			this.supportHandler.handleRequest(request);
		}
	}

}
