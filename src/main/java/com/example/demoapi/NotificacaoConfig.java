package com.example.demoapi;

import com.example.demoapi.notificacao.NotificadorEmail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificacaoConfig {


    @Bean
    public NotificadorEmail notificadorEmail(){
        NotificadorEmail notificador = new NotificadorEmail("smtp.alga.mail.com.br");
        notificador.setCaixaAlta(true);

        return notificador;
    }
}
