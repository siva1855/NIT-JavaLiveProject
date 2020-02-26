package siva.nit.config;

import java.util.Properties;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableTransactionManagement
@EnableWebMvc
@PropertySource("classpath:application.properties")
@ComponentScan("siva.nit")
public class AppConfig {
	@Autowired
	private Environment environment;

	// 1. DataSource
	@Bean
	public DataSource dataSource() {
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setDriverClassName(environment.getProperty("database.driver"));
		basicDataSource.setUrl(environment.getProperty("database.url"));
		basicDataSource.setUsername(environment.getProperty("database.username"));
		basicDataSource.setPassword(environment.getProperty("database.password"));
		return basicDataSource;
	}

	// 2. SessionFactrory
	@Bean
	public LocalSessionFactoryBean localSessionFactoryBean() {
		LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
		localSessionFactoryBean.setDataSource(dataSource());
		localSessionFactoryBean.setHibernateProperties(properties());
		localSessionFactoryBean.setPackagesToScan("siva.nit.model");
		return localSessionFactoryBean;
	}

	// 3.ORM Properties
	@Bean
	public Properties properties() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect", environment.getProperty("orm.dialect"));
		properties.put("hibernate.show_sql", environment.getProperty("orm.show-sql"));
		properties.put("hibernate.format_sql", environment.getProperty("orm.format-sql"));
		properties.put("hibernate.hbm2ddl.auto", environment.getProperty("orm.ddlauto"));
		return properties;
	}

	// 4. HibernateTemplate
	@Bean
	public HibernateTemplate hibernateTemplate() {
		HibernateTemplate hibernateTemplate = new HibernateTemplate();
		hibernateTemplate.setSessionFactory(localSessionFactoryBean().getObject());
		return hibernateTemplate;
	}

	// 5. HibernateTransactionManager
	@Bean
	public HibernateTransactionManager hibernateTransactionManager() {
		HibernateTransactionManager hibernateTransactionManager = new HibernateTransactionManager();
		hibernateTransactionManager.setSessionFactory(localSessionFactoryBean().getObject());
		return hibernateTransactionManager;
	}

	// 6. ViewResovler
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
		internalResourceViewResolver.setPrefix(environment.getProperty("mvc.prefix"));
		internalResourceViewResolver.setSuffix(environment.getProperty("mvc.suffix"));
		return internalResourceViewResolver;
	}

	// 7.Activate CommonsMultipartResolver
	@Bean
	public CommonsMultipartResolver multipartResolver() {
		return new CommonsMultipartResolver();
	}
}
