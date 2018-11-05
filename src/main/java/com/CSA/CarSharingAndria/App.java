package com.CSA.CarSharingAndria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.CSA.CarSharingAndria.configuration.JpaConfiguration;

@Import(JpaConfiguration.class)
@ComponentScan("com.CSA.CarSharingAndria")
@SpringBootApplication(scanBasePackages={"com.CSA.CarSharingAndria"})
public class App 
{
	 
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
