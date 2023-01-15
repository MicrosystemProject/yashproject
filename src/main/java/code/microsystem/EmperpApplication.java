package code.microsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class EmperpApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmperpApplication.class, args);
	}

}
