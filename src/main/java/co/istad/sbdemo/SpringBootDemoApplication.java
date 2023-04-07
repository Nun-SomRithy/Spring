package co.istad.sbdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringBootDemoApplication implements CommandLineRunner {



	public static void main(String[] args) {

		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

	@Value("${server.port}")
	private Integer port;

	@Value("${dev.Ops}")
	private String devOps;

	@Override
	public void run(String... args) throws Exception {
	log.info("port: {}",port);
	log.info("DevOps Class = {} ",devOps);
	}
}
