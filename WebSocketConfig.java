package com.pro.webSocket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;

import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer
{   
	
	 public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
	        registry.addHandler(myWebSocketHandler(), "/ws").setAllowedOrigins("*");
	    }

	    @Bean
	    public WebSocketHandler myWebSocketHandler() {
	        return new MyWebSocketHandlerer();
	    }
	}