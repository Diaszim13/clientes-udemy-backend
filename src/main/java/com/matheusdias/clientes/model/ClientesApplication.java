package com.matheusdias.clientes.model;

import com.matheusdias.clientes.model.entity.Clientes;
import com.matheusdias.clientes.model.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = {"boot.registration"} , exclude = JpaRepositoriesAutoConfiguration.class)
public class ClientesApplication extends SpringBootServletInitializer {

//	@Autowired
//	public ClientesRepository repository;

	@Bean
	public CommandLineRunner run() {
		return args -> {
			Clientes clientes = Clientes.builder().cpf("99999999999").nome("TESTE").build();
//			repository.save(clientes);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(ClientesApplication.class, args);
	}
}
