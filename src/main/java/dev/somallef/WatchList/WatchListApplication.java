package dev.somallef.WatchList;

import dev.somallef.WatchList.service.APIConsumer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WatchListApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(WatchListApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		var url = "https://www.omdbapi.com/?t=The+Sopranos&apikey=d8d4d5a9";
		var apiConsumer = new APIConsumer();
		var json = apiConsumer.getData(url);
		System.out.println(json);

	}
}
