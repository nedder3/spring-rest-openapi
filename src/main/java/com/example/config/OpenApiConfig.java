package com.example.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
    http://localhost:8000/v3/api-docs
    http://localhost:8000/swagger-ui/index.html
*/

@Configuration
public class OpenApiConfig {
    //se marca con bean para que el framework lea el objeto
    @Bean
    public OpenAPI openAPI(){
        return new OpenAPI().info(new Info()
                        .title("Employees API")
                        .description("API REST para empleados de la empresa x")
                        .version("v0.0.01")
                        .license(new License().name("Apache 2.0").url("https://www.example.com/")))
                .externalDocs(new ExternalDocumentation()
                        .description("Wiki Docs")
                        .url("https://www.example.com/"));

    }
}
