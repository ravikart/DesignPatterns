package designpatterns.demo.decoratorpattern;

public class BasicVideo implements VideoContent{

	@Override
	public void play() {
		System.out.println("Play Video in Basic Video Class");
	}

}
