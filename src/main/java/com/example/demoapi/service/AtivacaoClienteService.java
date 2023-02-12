package com.example.demoapi.service;

import com.example.demoapi.model.Cliente;
import com.example.demoapi.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AtivacaoClienteService {

    @Autowired
    private List<Notificador> notificadores;

    public void ativar(Cliente cliente) {
        cliente.ativar();

        for (Notificador notificador : notificadores) {

            notificador.notificar(cliente, "seu cadastro no sistema está ativo!");
        }
    }

}
