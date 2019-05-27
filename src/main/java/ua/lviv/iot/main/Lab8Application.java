package ua.lviv.iot.main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

import ua.lviv.iot.creativity.model.Tissue;
import ua.lviv.iot.creativity.model.Type;
import ua.lviv.iot.creativity.repository.TissueRepository;

@SpringBootApplication
@EntityScan("ua.lviv.iot")
public class Lab8Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab8Application.class, args);
	} 
	
	@Bean 
	public CommandLineRunner tissueBean(TissueRepository repository) {
	    return (args) -> {
	      repository.save(new Tissue("Tissue1",15,Type.FISHING,20,40));
	      repository.save(new Tissue("Tissue2",15,Type.FISHING,40,80));
	      repository.save(new Tissue("Tissue3",15,Type.FISHING,80,160));
	      repository.findAll().forEach(student -> System.out.println(student));
	    };
	 
	}
	

}
