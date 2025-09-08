package com.sboot.moabayo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.sboot.moabayo")
@MapperScan("com.sboot.moabayo.dao")
public class MoabayoClientBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoabayoClientBankApplication.class, args);
	}

}
