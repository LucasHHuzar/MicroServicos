package br.com.up.ms_students;

import br.com.up.ms_students.http.StudentRest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class MsStudentsApplication {

	public static void main(String[] args) {

		SpringApplication.run(MsStudentsApplication.class, args);

	}

}
