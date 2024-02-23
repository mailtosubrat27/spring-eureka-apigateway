package com.app;

import org.springframework.cloud.gateway.config.GatewayProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

	@Bean
	 public RouteLocator customRouteLocator(RouteLocatorBuilder builder, GatewayProperties properties,
			 AddCustomHeaderFilter addCustomHeaderFilter) {
        // Configure your routes here
        return builder.routes()
                .route("MobileStoreProp", r -> r.path("/mobile/**")
                .and().method("GET")
                .filters(f -> f.filter(addCustomHeaderFilter))
                .uri("http://localhost:8081/"))
                .build();
    }
}
