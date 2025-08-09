package com.aruna.urlshortener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ApplicationProperties.class)
public class SpringBootUrlShortenerApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootUrlShortenerApplication.class, args);
	}
}

