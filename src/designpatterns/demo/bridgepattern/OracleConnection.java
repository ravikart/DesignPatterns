package designpatterns.demo.bridgepattern;

public class OracleConnection implements Connection{

	@Override
	public void connect() {
		System.out.println("Connected to Oracle Connection");
	}

	@Override
	public void executeQuery(String query) {
		System.out.println("Executing Query in Oracle");		
	}

}
