/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.gsgtech.gapp.social.google.config.xml;

import org.springframework.social.config.xml.AbstractProviderConfigBeanDefinitionParser;
import org.springframework.social.security.provider.SocialAuthenticationService;

import com.gsgtech.gapp.social.google.config.support.GoogleApiHelper;
import com.gsgtech.gapp.social.google.connect.GoogleConnectionFactory;
import com.gsgtech.gapp.social.google.security.GoogleAuthenticationService;

/**
 * Implementation of {@link AbstractProviderConfigBeanDefinitionParser} that
 * creates a {@link GoogleConnectionFactory}.
 * 
 * @author Hakan Dilek
 */
public class GoogleConfigBeanDefinitionParser extends
		AbstractProviderConfigBeanDefinitionParser {

	protected GoogleConfigBeanDefinitionParser() {
		super(GoogleConnectionFactory.class, GoogleApiHelper.class);
	}

	@Override
	protected Class<? extends SocialAuthenticationService<?>> getAuthenticationServiceClass() {
		return GoogleAuthenticationService.class;
	}

}