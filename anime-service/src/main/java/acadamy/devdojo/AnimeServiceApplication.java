package acadamy.devdojo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@SpringBootApplication
@ComponentScan(basePackages = {"outside.devdojo","acadamy.devdojo"})
public class AnimeServiceApplication {

	public static void main(String[] args) {
		var aplicationcontex = SpringApplication.run(AnimeServiceApplication.class, args);
		Arrays.stream(aplicationcontex.getBeanDefinitionNames()).forEach(System.out::println);

	}

}
