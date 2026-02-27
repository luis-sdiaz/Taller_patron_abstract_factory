package ucc.energia;

public interface EstacionFactory {
    CapturadorEnergia crearCapturador();
    ReguladorVoltaje crearRegulador();
}