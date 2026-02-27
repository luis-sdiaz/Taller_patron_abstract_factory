package ucc.energia;

// Esta es una CLASE que IMPLEMENTA la interfaz maestra
public class SolarFactory implements EstacionFactory {

    @Override
    public CapturadorEnergia crearCapturador() {
        // Retornamos el objeto real que creamos antes
        return new PanelFotovoltaico();
    }

    @Override
    public ReguladorVoltaje crearRegulador() {
        // Retornamos el objeto real que creamos antes
        return new InversorSolar();
    }
}