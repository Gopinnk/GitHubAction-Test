package com.school.management;

import java.sql.SQLException;

import javax.sql.DataSource;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import oracle.jdbc.pool.OracleDataSource;

@Configuration
@EnableTransactionManagement
//@EnableJpaRepositories("com.school.management.repository")
public class ConfigApp {
	
	@NotNull
	private String driverClassName;
	  
    @NotNull
    private String username;

    @NotNull
    private String password;

    @NotNull
    private String url;
   
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    
    @Primary
	@Bean(name = "datasource")
	public DataSource dataSource() throws SQLException {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
    	//OracleDataSource dataSource = new OracleDataSource();
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		dataSource.setUrl(url);
		dataSource.setDriverClassName(driverClassName);
				
    	/*dataSource.setUser(username);
    	dataSource.setPassword(password);
    	dataSource.setURL(url);
    	dataSource.setImplicitCachingEnabled(true);
    	dataSource.setFastConnectionFailoverEnabled(true);*/
		return dataSource;
	}
    
	@Bean(name = "entityManagerFactory")
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();

		return sessionFactory;
	}
    
    
       
          
}
