package et.com.zablon.TMS.Http;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class HttpClient {

    @Bean
    public RestTemplate get(){
        return new RestTemplate();
    }
}
