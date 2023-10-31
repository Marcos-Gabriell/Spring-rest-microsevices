package br.com.curso.apirest.Curso.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.persistence.Entity;

@SpringBootApplication
@EntityScan (basePackages = {"br.com.curso.apirest.Curso.Spring.model"})
@ComponentScan(basePackages = {"br.com.curso.apirest.Curso.Spring"})
@EnableJpaRepositories(basePackages = {"br.com.curso.apirest.Curso.Spring.repository"})
@EnableTransactionManagement
@EnableWebMvc
@RestController
@EnableAutoConfiguration
public class CursoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursoSpringApplication.class, args);
	}

}
