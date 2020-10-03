package com.example.nurb.ProjectTodoManagement;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.init.Jackson2RepositoryPopulatorFactoryBean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class ProjectTodoManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectTodoManagementApplication.class, args);
	}
	@Bean
	public ModelMapper getModelMapper(){

		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return  new ModelMapper();
	}
}
