package com.example.demoapi.notificacao;


import com.example.demoapi.model.Cliente;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("prod")
@Qualifier("normal")
@Component
public class NotificadorEmail implements Notificador {

    public NotificadorEmail(){
        System.out.println("Notificador email REAL");
    }


    @Override
    public void notificar(Cliente cliente, String mensagem){
        System.out.println("Notificando ..." + cliente.getEmail() + " usando smtp " + mensagem);
    }

}
