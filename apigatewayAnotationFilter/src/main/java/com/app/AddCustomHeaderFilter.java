package com.app;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;
@Component
public class AddCustomHeaderFilter implements GatewayFilter {

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		
		System.out.println("-----------Inside Filter ---------------");
		 ServerHttpRequest request = exchange.getRequest().mutate()
				 .header("Header_New",  "Test_Value")
	                .build();
		 
		 
	        return chain.filter(exchange.mutate().request(request).build());
	}

}
