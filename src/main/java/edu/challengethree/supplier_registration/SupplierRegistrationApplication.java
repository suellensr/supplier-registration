package edu.challengethree.supplier_registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SupplierRegistrationApplication {
	public static void main(String[] args) {
		SpringApplication.run(SupplierRegistrationApplication.class, args);
	}
}
