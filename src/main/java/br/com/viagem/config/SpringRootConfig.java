package br.com.viagem.config;

import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.hsqldb.util.DatabaseManagerSwing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan({ "br.com.viagem" })
@Configuration
public class SpringRootConfig {

	@Autowired
	DataSource dataSource;

	
	@PostConstruct
	public void startDBManager() throws SQLException {
		dataSource.getConnection();
		
		//hsqldb
		DatabaseManagerSwing.main(new String[] { "--url", "jdbc:hsqldb:mem:testdb", "--user", "sa", "--password", "" });
	}
	
}