package evolution.applicationNConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import evolution.applicationNConfiguration.common.AnyCommon;
import evolution.applicationNConfiguration.dao.AnyDao;
import evolution.applicationNConfiguration.service.AnotherService;
import evolution.applicationNConfiguration.service.AnyService;

@SpringBootApplication// It captures all @Configuration under the base package. 
public class Application implements CommandLineRunner {
	@Autowired
	private AnyDao anyDao;// Define a bean for AnyDao in AnyConfiguration.
	
	@Autowired
	private AnyCommon anyCommon;// Define a bean for AnyCommon in AnyConfiguration.
	
	@Autowired
	private AnyService anyService;// Define a bean for AnyService in AnotherConfiguration.
	
	@Autowired
	private AnotherService anotherService;
	
	public static void main(String[] args) {
		// You can shut down a spring boot application by calling close().
		SpringApplication.run(Application.class, args).close();
	}

	@Override
	public void run(String... arg0) throws Exception {
		anyDao.anyMethod();	
		anyCommon.anyMethod();
		anyService.anyMethod();
		anotherService.anyMethod();
	}
}
