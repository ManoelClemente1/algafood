package com.example.demoapi.service;

import com.example.demoapi.model.Cliente;
import com.example.demoapi.notificacao.Notificador;
import org.springframework.stereotype.Component;

public class AtivacaoClienteService {


    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void ativar(Cliente cliente){
        cliente.ativar();

        notificador.notificar(cliente,"seu cadastro no sistema está ativo!");
    }
}
