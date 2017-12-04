package org.asif.tile.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class TileSpringIntegrationWebAppInitializer  extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[]{RootConfig.class};
	}

	
	//Specify configuration class
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[]{TileWebConfig.class};
	}

	//Map DispatcherServlet to /
	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}

}
