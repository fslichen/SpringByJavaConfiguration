package evolution.anonymousClass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnyConfigurationClass {
	@Bean
	public AnyClass getAnyClass() {
		return new AnyClass() {
			public String anyMethod() {
				return "Hello World";
			}
		};
	}
}
