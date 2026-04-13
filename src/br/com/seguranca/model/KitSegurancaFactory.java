package br.com.seguranca.model;

public interface KitSegurancaFactory {
    Dispositivo criarSensor();
    String obterModelo();
}