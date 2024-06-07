package designpatterns.demo.templatemethodpattern;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public abstract class Report {
	
	private String textContent = new String();
	
	public final void generateReport(String fileName) {
		textContent = textContent + createHeader() + "\r\n";
		textContent = textContent + createBody() + "\r\n";
		textContent = textContent + createFooter() + "\r\n";
		
		try {
			Files.write(Paths.get(fileName), textContent.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public abstract String createHeader();
	
	public abstract String createBody();
	
	public abstract String createFooter();

}
