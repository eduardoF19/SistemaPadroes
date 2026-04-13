import br.com.seguranca.model.*;

public class Main {
    public static void main(String[] args) {

        CentralAlarme central = CentralAlarme.getInstancia();

        ConfiguradorSistema config = new ConfiguradorResidencial();

        System.out.println("---Iniciando Instalacao ---");
        config.instalar();

        central.log("Sistema pronto e monitorando via nuvem.");
    }
}