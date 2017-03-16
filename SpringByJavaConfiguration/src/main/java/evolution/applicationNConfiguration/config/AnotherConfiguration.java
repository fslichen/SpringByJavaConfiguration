package evolution.applicationNConfiguration.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import evolution.applicationNConfiguration.service.AnotherService;
import evolution.applicationNConfiguration.service.AnyService;

@Configuration
public class AnotherConfiguration {
	@Bean
	public AnyService anyService() {
		return new AnyService(name);
	}
	
	@Bean AnotherService anotherService() {
		return new AnotherService(url);
	}
	
	@Value("Elsa")// @Value runs before @Bean.
	private String name;
	
	@Value("${jdbc.url}")// Reads jdbc.url from application.properties under class path.
	private String url;
}
