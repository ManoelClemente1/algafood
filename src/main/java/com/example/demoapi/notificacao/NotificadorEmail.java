package com.example.demoapi.notificacao;


import com.example.demoapi.model.Cliente;
import org.springframework.stereotype.Component;

@Component
public class NotificadorEmail implements Notificador {

    @Override
    public void notificar(Cliente cliente, String mensagem){
        System.out.println("Notificando ..." + cliente.getEmail() + " usando smtp " + mensagem);
    }

}
