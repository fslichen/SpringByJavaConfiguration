package evolution.applicationNConfiguration.service;

public class AnyService {
	private String name;
	
	public AnyService(String name) {
		this.name = name;
	}
	
	public void anyMethod() {
		System.out.println("Hello " + name + ".");
	}
}
