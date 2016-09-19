package br.com.viagem.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import br.com.viagem.client.ViagemWSConfig;
import br.com.viagem.config.SpringRootConfig;
import br.com.viagem.config.SpringWebConfig;

/**
 * Classe utilizada para efetuar o carregamento do servlet context, definir os mapeamento e inicializar \
 * todas as configuracoes necessarias para os servicos de WS e de persistencia. 
 * @author joaopaulo
 *
 */
public class MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { SpringRootConfig.class, ViagemWSConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { SpringWebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		super.onStartup(servletContext);
		servletContext.setInitParameter("spring.profiles.active", "hsql");
	}

}