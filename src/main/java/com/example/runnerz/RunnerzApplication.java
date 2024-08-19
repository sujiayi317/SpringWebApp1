package com.example.runnerz;

import com.example.runnerz.run.Location;
import com.example.runnerz.run.Run;
import com.example.runnerz.run.RunRepository;
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

//	@Bean
//	CommandLineRunner commandLineRunner(RunRepository runRepository) {
//		// delete data.sql in resources package:
//		// INSERT INTO Run (id, title, started_on, completed_on, miles, location)
//		// VALUES (1, 'Morning Run', '2017-01-01 06:00:00', '2017-01-01 07:00:00', 5, 'OUTDOOR');
//		return args -> {
//			log.info("Runner started");
//			Run run = new Run(1,
//					"First Run",
//					LocalDateTime.now(),
//					LocalDateTime.now().plusHours(1),
//					5,
//					Location.OUTDOOR);
//			log.info("Run" + run);
//			runRepository.create(run);
//		};
//	}

}
