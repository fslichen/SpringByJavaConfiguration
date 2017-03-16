package evolution.applicationNConfiguration.service;

public class AnotherService {
	private String url;
	
	public AnotherService(String url) {
		this.url = url;
	}
	
	public void anyMethod() {
		System.out.println("The URL is " + this.url + ".");
	}
}
