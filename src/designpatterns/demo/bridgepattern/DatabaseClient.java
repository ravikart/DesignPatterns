package designpatterns.demo.bridgepattern;

public class DatabaseClient {
	
	private Connection connection;
	
	public DatabaseClient(Connection connection) {
		this.connection = connection;
	}
	
	public void executeQuery(String query) {
		connection.connect();
		connection.executeQuery(query);
	}

}
