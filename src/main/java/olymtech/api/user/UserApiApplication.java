package olymtech.api.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

/**
 * Created by JiangZhe on 16/3/30.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EntityScan(basePackageClasses = {UserApiApplication.class, Jsr310JpaConverters.class})
public class UserApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApiApplication.class, args);
    }
}
