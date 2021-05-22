package TAASS.ServiceDBComuni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceDbComuniApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDbComuniApplication.class, args);
	}

}
