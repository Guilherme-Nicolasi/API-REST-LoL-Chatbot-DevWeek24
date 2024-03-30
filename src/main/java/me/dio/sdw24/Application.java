package me.dio.sdw24;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import me.dio.sdw24.application.ListChampionsUseCase;
import me.dio.sdw24.domain.model.ports.ChampionsRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public ListChampionsUseCase provideListChampionsUseCase(ChampionsRepository championsRepository) {
		return new ListChampionsUseCase(championsRepository);
	}
}
