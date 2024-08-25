package com.allefmizael.watchlistapi;

import com.allefmizael.watchlistapi.service.OMDBService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class WatchlistApiApplication{

	public static void main(String[] args) {
		SpringApplication.run(WatchlistApiApplication.class, args);
	}

}
