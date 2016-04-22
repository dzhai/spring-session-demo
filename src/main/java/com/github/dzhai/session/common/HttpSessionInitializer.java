package com.github.dzhai.session.common;

import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;

public class HttpSessionInitializer extends AbstractHttpSessionApplicationInitializer {

	public HttpSessionInitializer() {
		super(HttpSessionConfig.class);
	}
}