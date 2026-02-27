package ucc.energia;

public class GestorEnergia {
    private CapturadorEnergia capturador;
    private ReguladorVoltaje regulador;

    // El constructor recibe la fábrica (Solar o Eólica)
    public GestorEnergia(EstacionFactory fabrica) {
        this.capturador = fabrica.crearCapturador();
        this.regulador = fabrica.crearRegulador();
    }

    public void operar() {
        capturador.recolectar();
        regulador.estabilizar();
    }
}
