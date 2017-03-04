package org.marchev.gated.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class GatedConfigServer {

	public static void main(String[] args) {
		SpringApplication.run(GatedConfigServer.class, args);
	}

}
