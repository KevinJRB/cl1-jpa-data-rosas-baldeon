package pe.edu.I202210236.cl1_jpa_data_rosas_baldeon.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class ConexionesConfig {

    @Bean
    public DataSource dataSource() {
        // Configuración de HikariCP
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setJdbcUrl("jdbc:mysql://localhost:3306/world");
        hikariConfig.setUsername("root");
        hikariConfig.setPassword("123456");

        // Configuraciones de HikariCP
        hikariConfig.setMaximumPoolSize(30);
        hikariConfig.setMinimumIdle(4);
        hikariConfig.setIdleTimeout(240000);
        hikariConfig.setConnectionTimeout(45000);

        return new HikariDataSource(hikariConfig);
    }
}