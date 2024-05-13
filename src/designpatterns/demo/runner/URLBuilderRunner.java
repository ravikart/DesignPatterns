package designpatterns.demo.runner;

import designpatterns.demo.builderpattern.URLBuilder;

public class URLBuilderRunner {

	public static void main(String[] args) {
		
		URLBuilder.Builder builder = new URLBuilder.Builder();
		
		URLBuilder urlBuilder = builder.protocal("https://").hostname("www.google.com/").pathParam("testing").queryParam("?working=test").build();
		
		System.out.println("-------------------------------");
		System.out.println(urlBuilder.protocal);
		System.out.println(urlBuilder.hostname);
		System.out.println(urlBuilder.pathParam);
		System.out.println(urlBuilder.queryParam);
		
		URLBuilder urlBuilderWithPort = builder.protocal("https://").hostname("localhost").port(":8080").pathParam("testing").queryParam("?working=test").build();
		
		System.out.println("-------------------------------");
		System.out.println(urlBuilderWithPort.protocal);
		System.out.println(urlBuilderWithPort.hostname);
		System.out.println(urlBuilderWithPort.port);
		System.out.println(urlBuilderWithPort.pathParam);
		System.out.println(urlBuilderWithPort.queryParam);
		
	}

}
