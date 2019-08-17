package com.example.project;
import com.example.project.Entity.Theme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
public class ProjectApplication implements CommandLineRunner {




	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
		System.out.println("Welcome to spring boot ..");
	}

    @Override
	public void run(String... args) throws Exception {


}

}



