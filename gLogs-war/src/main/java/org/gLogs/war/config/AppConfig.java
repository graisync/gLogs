package org.gLogs.war.config;

import org.gLogs.security.config.SecurityConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Main app configuration class.
 * In this class, there are all the main conf of the app
 * by annotation
 * 
 * 
 * @author thulliezj
 *
 */

@EnableWebMvc
@Configuration
@ComponentScan({"org.gLogs.war.controller","org.gLogs.war.component", "org.gLogs.security.config", "org.gLogs.engine.config"}) // Scan for the war and other package config
@Import({ SecurityConfiguration.class })
public class AppConfig extends WebMvcConfigurerAdapter{
	
	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/WEB-INF/resources/");
    }
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver
                          = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		// The following two lines are replacing the same line from the old propertie file
		viewResolver.setPrefix("/WEB-INF/jsp/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
}
