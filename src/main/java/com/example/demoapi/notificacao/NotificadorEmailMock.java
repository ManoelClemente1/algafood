package com.example.demoapi.notificacao;


import com.example.demoapi.model.Cliente;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@Qualifier("normal")
@Component
public class NotificadorEmailMock implements Notificador {

    public NotificadorEmailMock(){
        System.out.println("Notificador email MOCK");
    }


    @Override
    public void notificar(Cliente cliente, String mensagem){
        System.out.println("MOCK: Notificando..." + cliente.getEmail() + " usando smtp " + mensagem);
    }

}
