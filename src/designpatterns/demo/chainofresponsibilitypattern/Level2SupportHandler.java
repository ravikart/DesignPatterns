package designpatterns.demo.chainofresponsibilitypattern;

public class Level2SupportHandler implements SupportHandler {

	private SupportHandler supportHandler;

	@Override
	public void setNextSupportHandler(SupportHandler supportHandler) {
		this.supportHandler = supportHandler;
	}

	@Override
	public void handleRequest(Request request) {
		if(request.getPriority() == PriorityEnum.HIGH) {
			System.out.println("High Priority is handled by Level 2 Support Handler");
		}else {
			this.supportHandler.handleRequest(request);
		}
	}

}
