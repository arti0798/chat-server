package com.chatserver.chatserverconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * ChatServerConfig
 */
@Configuration
@EnableWebSocketMessageBroker
public class ChatServerConfig implements WebSocketMessageBrokerConfigurer {

@Override
  public void configureMessageBroker(MessageBrokerRegistry config) {

    config.enableSimpleBroker("/chat-room");
    config.setApplicationDestinationPrefixes("/chat-app");
  }

  @Override
  public void registerStompEndpoints(StompEndpointRegistry registry) {
	  registry.addEndpoint("/sock").setAllowedOrigins("*").withSockJS();
  }
}