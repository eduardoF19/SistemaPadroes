package br.com.seguranca.model;

public abstract class ConfiguradorSistema {
    public abstract KitSegurancaFactory prepararKit();

    public void instalar() {
        KitSegurancaFactory kit = prepararKit();
        Dispositivo sensor = kit.criarSensor();
        System.out.println("Instalando modelo: " + kit.obterModelo());
        sensor.executar();
    }
}