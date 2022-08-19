package com.idat.MiPrimerConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MiPrimerConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiPrimerConfigServerApplication.class, args);
	}

}
