package br.com.viagem.config.db;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Classe para configuração do datasource e mecanismo transacional para ser utilizado como injecao de dependencia
 *  na persistencia dos dados do sistema
 * @author joaopaulo
 *
 */

@Profile("hsql")
@Configuration
@EnableTransactionManagement
@ComponentScan({ "br.com.viagem" })
public class HsqlDataSource {

	//jdbc:hsqldb:mem:testdb
	@Bean
	public DataSource dataSource() {
		
		EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
		EmbeddedDatabase db = builder.setType(EmbeddedDatabaseType.HSQL).addScript("db/sql/criar-db.sql").build();
		
		//BasicDataSource dataSource = new BasicDataSource();
		//dataSource.setDriverClassName("org.hsqldb.jdbcDriver");
		//dataSource.setUrl("jdbc:hsqldb:mem:testdb");
		//dataSource.setUsername("sa");
		//dataSource.setPassword("");
		//dataSource.setInitialSize(5);
		
		
		return db;
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan(new String[] { "br.com.viagem.model" });
		sessionFactory.setHibernateProperties(hibernateProperties());

		return sessionFactory;
	}
	
	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(sessionFactory);

		return txManager;
	}

	@Bean
	public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
		return new PersistenceExceptionTranslationPostProcessor();
	}
	 
	Properties hibernateProperties() {
		return new Properties() {
			{
				setProperty("hibernate.hbm2ddl.auto", "validate");
				setProperty("hibernate.dialect", "org.hibernate.dialect.HSQLDialect");
				setProperty("hibernate.show_sql", "false");
			}
		};
	}
	
	 

}