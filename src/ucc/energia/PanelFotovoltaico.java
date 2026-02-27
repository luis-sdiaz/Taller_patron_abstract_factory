package ucc.energia;

// Esta clase implementa el contrato de Capturador
public class PanelFotovoltaico implements CapturadorEnergia {
    @Override
    public void recolectar() {
        System.out.println("☀️ [SOLAR] Capturando fotones... Generando corriente continua (DC).");
    }
}
