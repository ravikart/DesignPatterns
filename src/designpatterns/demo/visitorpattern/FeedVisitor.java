package designpatterns.demo.visitorpattern;

public class FeedVisitor implements Visitor{

	@Override
	public String visit(Lion lion) {
		return "Feeding " + lion.getFood() + " to LIONS";
	}

	@Override
	public String visit(Tiger tiger) {
		return "Feeding " + tiger.getFood() + " to TIGER";
	}

}
