package br.com.seguranca.model;

public abstract class Dispositivo {
    protected ProtocoloComunicacao protocolo;

    protected Dispositivo(ProtocoloComunicacao protocolo) {
        this.protocolo = protocolo;
    }

    public abstract void executar();
}