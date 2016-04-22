package com.github.dzhai.session.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.session.web.http.CookieSerializer;
import org.springframework.session.web.http.DefaultCookieSerializer;

@Configuration
@EnableRedisHttpSession
public class HttpSessionConfig {

	@Bean
	public JedisConnectionFactory connectionFactory() {
		JedisConnectionFactory connection = new JedisConnectionFactory();
		connection.setPort(6379);
		connection.setHostName("127.0.0.1");
		return connection;
	}

	@Bean
	public CookieSerializer cookieSerializer() {
		DefaultCookieSerializer serializer = new DefaultCookieSerializer();
		serializer.setCookieName("login.user.id");
		serializer.setCookiePath("/");
		serializer.setDomainNamePattern("^.+?\\.(\\w+\\.[a-z]+)$");
		return serializer;
	}
}