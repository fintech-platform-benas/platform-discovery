package com.paymentchain.eurekaServer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(
	webEnvironment = SpringBootTest.WebEnvironment.NONE,
	properties = {
		"eureka.client.enabled=false",
		"eureka.client.register-with-eureka=false",
		"eureka.client.fetch-registry=false",
		"spring.cloud.config.enabled=false"
	}
)
@ActiveProfiles("test")
class EurekaServerApplicationTests {

	@Test
	void contextLoads() {
		// Test passes if Spring context loads successfully
	}

}
