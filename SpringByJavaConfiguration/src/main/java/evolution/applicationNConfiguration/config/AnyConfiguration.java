package evolution.applicationNConfiguration.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import evolution.applicationNConfiguration.common.AnyCommon;
import evolution.applicationNConfiguration.dao.AnyDao;

@Configuration
public class AnyConfiguration {
	@Bean
	public AnyDao anyDao() {// The modifier should not be private.
		return new AnyDao();
	}
	
	@Bean
	protected AnyCommon anyCommon() {// The modifier should not be private.
		return new AnyCommon();
	}
}
