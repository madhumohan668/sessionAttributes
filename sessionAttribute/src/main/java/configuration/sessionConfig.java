package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages="com.controller")

public class sessionConfig{
@Bean
public InternalResourceViewResolver ViewResolver() {
	InternalResourceViewResolver viewresolver = new InternalResourceViewResolver();
	viewresolver.setPrefix("/WEB-INF/view/");
	viewresolver.setSuffix(".jsp");
	return viewresolver;
}
}
