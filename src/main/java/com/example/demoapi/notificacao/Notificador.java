package com.example.demoapi.notificacao;

import com.example.demoapi.model.Cliente;

public interface Notificador {
    void notificar(Cliente cliente, String message);
}
