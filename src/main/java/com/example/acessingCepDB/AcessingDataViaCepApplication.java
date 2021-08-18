package com.example.acessingCepDB;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.acessingCepDB.entity.CepEntity;
import com.example.acessingCepDB.repository.CepRepository;
/**
 * 
 * @author Chrystian Rocha
 *
 */
@SpringBootApplication
public class AcessingDataViaCepApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcessingDataViaCepApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CepRepository repository) {
		return (args) -> {
			// save a few customers
			repository.save(new CepEntity("92990-000", "", "", "Eldorado do Sul", "RS"));
			repository.save(new CepEntity("97957-000", "", "Linha Porto Alegre", "Guarani das Missões", "RS"));
			repository.save(new CepEntity("91270-020", "Acesso A", "Morro Santana", "Porto Alegre", "RS"));
			repository.save(
					new CepEntity("04180-112", "Travessa 19 de Agosto", "Jardim Maria Estela", "São Paulo", "SP"));
			repository.save(
					new CepEntity("08240-001", "Rua 23 de Novembro", "Vila Progresso (Zona Leste)", "São Paulo", "SP"));
			
		};
	}
	
}
