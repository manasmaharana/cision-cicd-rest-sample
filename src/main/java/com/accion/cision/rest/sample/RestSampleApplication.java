package com.accion.cision.rest.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages={
		"com.accion.cision.rest.sample"})
@EnableJpaRepositories("com.accion.cision.rest.sample.repository")
@EnableAutoConfiguration()
public class RestSampleApplication extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(RestSampleApplication.class, args);
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(RestSampleApplication.class);
    }
}
