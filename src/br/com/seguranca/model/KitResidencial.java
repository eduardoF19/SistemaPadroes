package br.com.seguranca.model;

public class KitResidencial implements KitSegurancaFactory {
    @Override
    public Dispositivo criarSensor() {
        return new SensorPresenca(new WiFiProtocolo());
    }

    @Override
    public String obterModelo() {
        return "Kit Residencial Standard v2.0";
    }
}