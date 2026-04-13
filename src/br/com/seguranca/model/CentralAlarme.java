package br.com.seguranca.model;

public class CentralAlarme {
    private static CentralAlarme instancia;

    private CentralAlarme() {}

    public static synchronized CentralAlarme getInstancia() {
        if (instancia == null) {
            instancia = new CentralAlarme();
        }
        return instancia;
    }

    public void log(String evento) {
        System.out.println("[CENTRAL] Evento registrado: " + evento);
    }
}