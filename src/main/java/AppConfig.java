import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Person person() {
        return new Person();
    }

    @Bean
    public Address address() {
        return new Address();
    }
}
