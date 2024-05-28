package designpatterns.demo.runner;

import designpatterns.demo.bridgepattern.DatabaseClient;
import designpatterns.demo.bridgepattern.MySQLConnection;
import designpatterns.demo.bridgepattern.OracleConnection;
import designpatterns.demo.bridgepattern.SQLServer;

public class BridgeDesignPatternRunner {
	
//	In a typical application, you might need to interact with 
//	various types of databases such as MySQL, Oracle, or 
//	SQL Server. Each of these databases has a different 
//	way of establishing a connection, executing queries, and handling results.

	public static void main(String[] args) {
		DatabaseClient oracleClient = new DatabaseClient(new OracleConnection());
		DatabaseClient mySqlClient = new DatabaseClient(new MySQLConnection());
		DatabaseClient sqlServerClient = new DatabaseClient(new SQLServer());
		
		oracleClient.executeQuery("Oracle");
		mySqlClient.executeQuery("MySQL");
		sqlServerClient.executeQuery("SQL Server");
	}

}
