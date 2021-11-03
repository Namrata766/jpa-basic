package com.nam.jpa.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
public class DbDataSourceConfig {
	
	private String dbDriverClass = "oracle.jdbc.driver.OracleDriver";

	@Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(dbDriverClass);
        dataSourceBuilder.url("DB URL");
        dataSourceBuilder.username("USER NAME");
        dataSourceBuilder.password("PASSWORD");
        return dataSourceBuilder.build();
    }
	
	@Bean
	public DataSourceTransactionManager transactionManager(DataSource datasource) {
		return new DataSourceTransactionManager(datasource);
	}
}
