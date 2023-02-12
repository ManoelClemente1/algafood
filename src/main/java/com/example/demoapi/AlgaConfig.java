package com.example.demoapi;

import com.example.demoapi.notificacao.NotificadorEmail;
import com.example.demoapi.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AlgaConfig {

    @Bean
    public NotificadorEmail notificadorEmail(){
        NotificadorEmail notificador = new NotificadorEmail("smtp.alga.mail.com.br");
        notificador.setCaixaAlta(true);

        return notificador;
    }

    @Bean
    public AtivacaoClienteService ativacao(){
        return new AtivacaoClienteService(notificadorEmail());
    }

}
