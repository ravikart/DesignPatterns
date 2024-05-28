package designpatterns.demo.bridgepattern;

public interface Connection {
	
	void connect();
	
	void executeQuery(String query);

}
