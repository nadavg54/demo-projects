package snadav54.examples.springcloud.demostream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;

@SpringBootApplication
public class DemoStreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoStreamApplication.class, args);
	}

	@Bean
	public Consumer<Person> log() {
		return person -> {
			System.out.println("Received: " + person);
		};
	}

	public static class Person {
		private String name;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String toString() {
			return this.name;
		}
	}

}
