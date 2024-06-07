package designpatterns.demo.visitorpattern;

public class SoundVisitor implements Visitor{

	@Override
	public String visit(Lion lion) {
		return "Lion : " + lion.getSound();
	}

	@Override
	public String visit(Tiger tiger) {
		return "Tiger : " + tiger.getSound();
	}

}
