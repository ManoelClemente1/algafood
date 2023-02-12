package com.example.demoapi.notificacao;


import com.example.demoapi.model.Cliente;


public class NotificadorEmail implements Notificador {

    private boolean caixaAlta;
    private String hostServidorSmtp;

    public NotificadorEmail(String hostServidorSmtp){
        this.hostServidorSmtp = hostServidorSmtp;
        System.out.println("NotificadorEmail");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem){
        if(this.caixaAlta){
            mensagem = mensagem.toUpperCase();
        }
        System.out.println("Notificando ..." + cliente.getEmail() + " usando smtp " + this.hostServidorSmtp + " mensagem "
        + mensagem);
    }


    public void setCaixaAlta(boolean caixaAlta) {
        this.caixaAlta = caixaAlta;
    }
}
