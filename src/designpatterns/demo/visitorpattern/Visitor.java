package designpatterns.demo.visitorpattern;

public interface Visitor {
	
	public String visit(Lion lion);
	
	public String visit(Tiger tiger);

}
