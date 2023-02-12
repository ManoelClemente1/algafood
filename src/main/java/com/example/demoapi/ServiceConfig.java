package com.example.demoapi;

import com.example.demoapi.notificacao.Notificador;
import com.example.demoapi.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {


    @Bean
    public AtivacaoClienteService ativacao(Notificador notificador){
        return new AtivacaoClienteService(notificador);
    }
}
