package com.example.runnerz;

import com.example.runnerz.run.Location;
import com.example.runnerz.run.Run;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class RunnerzApplication {
	private static final Logger log = LoggerFactory.getLogger(RunnerzApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RunnerzApplication.class, args);
		log.info("Application started");

	}

	@Bean
	CommandLineRunner commandLineRunner() {
		return args -> {
			log.info("Runner started");
			Run run = new Run(1,
					"First Run",
					LocalDateTime.now(),
					LocalDateTime.now().plusHours(1),
					5,
					Location.OUTDOOR);
			log.info("Run" + run);
		};
	}

}
