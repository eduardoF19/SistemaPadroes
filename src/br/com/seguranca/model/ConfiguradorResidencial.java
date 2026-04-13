package br.com.seguranca.model;

public class ConfiguradorResidencial extends ConfiguradorSistema {
    @Override
    public KitSegurancaFactory prepararKit() {
        return new KitResidencial();
    }
}