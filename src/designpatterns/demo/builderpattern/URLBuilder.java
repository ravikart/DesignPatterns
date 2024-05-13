package designpatterns.demo.builderpattern;

public class URLBuilder {
	
	public final String protocal;
	
	public final String hostname;
	
	public final String port;
	
	public final String pathParam;
	
	public final String queryParam;
	
	private URLBuilder(Builder builder) {
		this.protocal = builder.protocal;
		this.hostname = builder.hostname;
		this.port = builder.port;
		this.pathParam = builder.pathParam;
		this.queryParam = builder.queryParam;
	}

	public static class Builder{
		
		private String protocal;
		
		private String hostname;
		
		private String port;
		
		private String pathParam;
		
		private String queryParam;
		
		public Builder protocal(String protocal) {
			this.protocal = protocal;
			return this;
		}
		
		public Builder hostname(String hostname) {
			this.hostname = hostname;
			return this;
		}
		
		public Builder port(String port) {
			this.port = port;
			return this;
		}
		
		public Builder pathParam(String pathParam) {
			this.pathParam = pathParam;
			return this;
		}
		
		public Builder queryParam(String queryParam) {
			this.queryParam = queryParam;
			return this;
		}
		
		public URLBuilder build() {
			return new URLBuilder(this);
		}
		
	}

}
