package com.example.demoapi.service;

import com.example.demoapi.model.Cliente;
import com.example.demoapi.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    @Autowired
    private Notificador notificador;

    public void ativar(Cliente cliente){
        cliente.ativar();

        notificador.notificar(cliente,"seu cadastro no sistema está ativo!");
    }

}
