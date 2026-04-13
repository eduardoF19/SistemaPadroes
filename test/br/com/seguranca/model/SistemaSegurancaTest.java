package br.com.seguranca.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SistemaSegurancaTest {

    @Test
    public void testeSingletonCentralAlarme() {
        CentralAlarme instancia1 = CentralAlarme.getInstancia();
        CentralAlarme instancia2 = CentralAlarme.getInstancia();

        assertNotNull(instancia1, "A instância não deve ser nula");
        assertSame(instancia1, instancia2, "Ambas as instâncias devem ser exatamente a mesma (Singleton)");
    }

    @Test
    public void testeMontagemKitResidencial() {
        ConfiguradorSistema config = new ConfiguradorResidencial();
        KitSegurancaFactory kit = config.prepararKit();
        Dispositivo sensor = kit.criarSensor();

        assertEquals("Kit Residencial Standard v2.0", kit.obterModelo());
        assertTrue(sensor instanceof SensorPresenca, "O sensor deve ser do tipo SensorPresenca");
    }

    @Test
    public void testeBridgeProtocolo() {
        ProtocoloComunicacao wifi = new WiFiProtocolo();
        SensorPresenca sensor = new SensorPresenca(wifi);

        assertDoesNotThrow(() -> sensor.executar(), "A execução do Bridge não deve lançar exceções");
    }
}