package net.genspark;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean("address1")
	public Address getAddress(Service service1) {
		return new AddressA(service1);
	}
	
	
	@Bean("service1")
	public Service getService() {
		return new ServiceA();
	}
	

}
