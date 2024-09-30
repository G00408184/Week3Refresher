package ie.atu.week3refresher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Week3RefresherApplication {

	public static void main(String[] args) {
		SpringApplication.run(Week3RefresherApplication.class, args);
	}

}
