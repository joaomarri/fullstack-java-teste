package br.com.viagem.config;

import java.sql.SQLException;

import javax.annotation.PostConstruct;

import org.hsqldb.util.DatabaseManagerSwing;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan({ "br.com.viagem" })
@Configuration
public class SpringRootConfig {

	
	@PostConstruct
	public void startDBManager() throws SQLException {
		
		//hsqldb
		DatabaseManagerSwing.main(new String[] { "--url", "jdbc:hsqldb:mem:testdb", "--user", "sa", "--password", "" });
	}
	
}