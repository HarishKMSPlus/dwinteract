package splusDwInteract;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import splusDwInteract.configuration.DwJpaConfiguration;
/*
 * Author : Dhiraj
 * info   : This is entry class [ main program initializes Spring and hands over the control ]
 */
@Import(DwJpaConfiguration.class)
@SpringBootApplication
public class Application
{
	public static void main(String[] args){
		SpringApplication.run(Application.class, args);
	}

	}
