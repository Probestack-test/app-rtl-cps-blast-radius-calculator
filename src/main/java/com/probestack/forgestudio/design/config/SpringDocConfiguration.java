package com.probestack.forgestudio.design.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "com.probestack.forgestudio.design.config.SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Blast Radius Calculator")
                                .description("Pre-deployment impact analysis engine. Before a change reaches production,  calculates exactly how many users, revenue, regions, and downstream services  would be affected if it goes wrong. Uses the service dependency graph, live  traffic patterns, customer tiers, and revenue attribution to answer the  question every release manager asks: \"What's the worst-case scenario?\" Provides data-driven recommendations for canary percentage, rollback  triggers, and deploy timing. ")
                                .contact(
                                        new Contact()
                                                .name("ForgeSphere Release Engineering")
                                                .email("release-eng@forgesphere.example.com")
                                )
                                .version("1.0.0")
                )
                .components(
                        new Components()
                                .addSecuritySchemes("bearerAuth", new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT")
                                )
                )
        ;
    }
}
