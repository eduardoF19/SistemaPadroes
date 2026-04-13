package br.com.seguranca.model;

public class SensorPresenca extends Dispositivo {
    public SensorPresenca(ProtocoloComunicacao protocolo) {
        super(protocolo);
    }

    @Override
    public void executar() {
        System.out.print("Sensor de Presença ativado... ");
        protocolo.enviarDados("Movimento Detectado!");
    }
}