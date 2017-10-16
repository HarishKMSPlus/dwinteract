package splusDwInteract;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

import splusDwInteract.configuration.DwJpaConfiguration;
/*
 * Author : Dhiraj
 * info   : This is entry class [ main program initializes Spring and hands over the control ]
 */
@Import(DwJpaConfiguration.class)
@SpringBootApplication
public class Application extends SpringBootServletInitializer
{
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

	
	public static void main(String[] args){
		SpringApplication.run(Application.class, args);
	}

	}
