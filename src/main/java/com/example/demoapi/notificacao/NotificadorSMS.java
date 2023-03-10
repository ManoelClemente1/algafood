package com.example.demoapi.notificacao;


import com.example.demoapi.model.Cliente;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("urgente")
@Component
public class NotificadorSMS implements Notificador {

    @Override
    public void notificar(Cliente cliente, String mensagem){
        System.out.println("Notificando .... " + cliente.getNome() + " por sms");
    }

}
