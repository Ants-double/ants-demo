package com.ants.dubbo.samples.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lyy08
 */
@SpringBootApplication
@EnableDubbo
public class DubboSamplesProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboSamplesProviderApplication.class, args);
	}

}
