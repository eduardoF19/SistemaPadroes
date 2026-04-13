package br.com.seguranca.model;

public class WiFiProtocolo implements ProtocoloComunicacao {
    @Override
    public void enviarDados(String mensagem) {
        System.out.println("[WiFi] Transmitindo: " + mensagem);
    }
}