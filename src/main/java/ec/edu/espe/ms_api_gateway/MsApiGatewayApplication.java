package ec.edu.espe.ms_api_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsApiGatewayApplication.class, args);
	}

	@org.springframework.context.annotation.Bean
	public org.springframework.web.servlet.config.annotation.WebMvcConfigurer corsConfigurer() {
		return new org.springframework.web.servlet.config.annotation.WebMvcConfigurer() {
			@Override
			public void addCorsMappings(org.springframework.web.servlet.config.annotation.CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedOrigins("*")
						.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
						.allowedHeaders("*");
			}
		};
	}

}
