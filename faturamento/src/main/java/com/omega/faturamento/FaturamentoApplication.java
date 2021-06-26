package com.omega.faturamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@RibbonClient(name = "financeiro")
public class FaturamentoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FaturamentoApplication.class, args);
    }

}
