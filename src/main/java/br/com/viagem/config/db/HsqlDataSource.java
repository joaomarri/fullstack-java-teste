package br.com.viagem.config.db;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@Profile("hsql")
@Configuration
public class HsqlDataSource {

	//jdbc:hsqldb:mem:viagemdb
	@Bean
	public DataSource dataSource() {
		
		EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
		EmbeddedDatabase db = builder.setType(EmbeddedDatabaseType.HSQL).addScript("db/sql/criar-db.sql").build();
		
		//BasicDataSource dataSource = new BasicDataSource();
		//dataSource.setDriverClassName("org.hsqldb.jdbcDriver");
		//dataSource.setUrl("jdbc:hsqldb:mem:viagemdb");
		//dataSource.setUsername("sa");
		//dataSource.setPassword("");
		//dataSource.setInitialSize(5);
		
		
		return db;
	}

}