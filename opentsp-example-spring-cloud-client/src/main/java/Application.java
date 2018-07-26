import com.mapbar.test.AppleBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liujk on 2017/7/31.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages="com.mapbar.*")
public class Application {

    public  static  void main(String args[]){
        SpringApplication.run(Application.class, args);
    }

    @Bean(name = "appleBean")
    public AppleBean appleBean(){

        return new AppleBean();
    }


}
