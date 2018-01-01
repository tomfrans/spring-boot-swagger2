package com.fs;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
    public Docket api() {
		
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("com.fs.rest"))              
          .paths(PathSelectors.any())                          
          .build().apiInfo(this.apiInfo())
          .tags(new Tag("Flight Service", "All apis relating to flight"),
        		  new Tag("Hotel Service", "All apis relating to hotel"));                                           
    }
	
	private ApiInfo apiInfo() {		
	     return new ApiInfo(
	       "Spring Boot Swagger", 
	       "Flight Status Search.", 
	       "1.0.0", 
	       "Terms of service", 
	       new Contact("Tomfrans Davis", "www.example.com", "tomfrans@gmail.com"), 
	       "License of API", 
	       "API license URL", Collections.EMPTY_LIST);
	}
}
