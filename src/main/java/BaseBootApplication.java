import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import java.util.Properties;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = {"com.msg.baseBoot"})
public class BaseBootApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        builder.sources(BaseBootApplication.class);
        builder.properties(getProperties());
        return builder;
    }

    public static void main(String[] args) {
        SpringApplication sa = new SpringApplication(BaseBootApplication.class);
        sa.run(args);
    }

    private Properties getProperties() {
        Properties prop = new Properties();
        prop.put("spring.config.location", "optional:classpath:boot_base_app/");
        prop.put("spring.config.additional-location", "optional:classpath:/application.yml");
        return prop;
    }

}
