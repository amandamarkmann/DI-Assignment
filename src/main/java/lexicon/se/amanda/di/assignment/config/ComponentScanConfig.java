package lexicon.se.amanda.di.assignment.config;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@ComponentScan("lexicon.se.amanda.di.assignment") //var den ska leta
@Configuration
	public class ComponentScanConfig {

	@Bean
	public Scanner scanner() {
		return new Scanner(System.in);
	}
	
	
}
