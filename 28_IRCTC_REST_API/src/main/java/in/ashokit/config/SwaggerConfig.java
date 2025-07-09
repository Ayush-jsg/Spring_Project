package in.ashokit.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

	@Bean
	public OpenAPI apiDoc() {
		return new OpenAPI().info(new Info().title("IRCTC API").description("IRCTC Booking REST API").version("v1.0"));
	}
}
