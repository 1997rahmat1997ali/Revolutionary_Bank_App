package com.ali.Revolutionary_Bank;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Revolutionary Bank App",
				description = "Backend Rest APIs for Bank",
				version = "v1.0",
				contact = @Contact(
						name = "Md Rahmat Ali",
						email = "1997rahmat1997ali@gmail.com",
						url = ""
				),
				license = @License(
						name = "Revolutionary Bank App",
						url = ""
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Revolutionary Bank App",
				url = ""
		)
)
public class RevolutionaryBankApplication {

	public static void main(String[] args) {SpringApplication.run(RevolutionaryBankApplication.class, args);
	}

}
