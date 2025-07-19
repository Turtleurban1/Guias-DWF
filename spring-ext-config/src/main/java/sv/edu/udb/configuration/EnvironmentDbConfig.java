package sv.edu.udb.configuration;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import javax.sql.DataSource;
import java.util.Objects;
@Configuration
public class EnvironmentDbConfig {
    private final Environment environment;
    public EnvironmentDbConfig(final Environment environment) {
        this.environment = Objects.requireNonNull(environment);
    }
    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder
                .create()
                .driverClassName(environment.getProperty("db.driver"))
                .url(environment.getProperty("db.url"))
                .username(environment.getProperty("db.username"))
                .password(environment.getProperty("db.password"))
                .build();
    }
    public String getDbDriver() {
        return environment.getProperty("db.driver");
    }
    public String getDbUrl() {
        return environment.getProperty("db.url");
    }
    public String getDbUsername() {
        return environment.getProperty("db.username");
    }
    public String getDbPassword() {
        return environment.getProperty("db.password");
    }
}
