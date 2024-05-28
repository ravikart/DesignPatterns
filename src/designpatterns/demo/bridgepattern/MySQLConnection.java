package designpatterns.demo.bridgepattern;

public class MySQLConnection implements Connection{

	@Override
	public void connect() {
		System.out.println("Connected to MySQL Connection");
	}

	@Override
	public void executeQuery(String query) {
		System.out.println("Executing Query in MySQL");		
	}
	

}
