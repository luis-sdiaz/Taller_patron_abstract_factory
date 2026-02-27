package ucc.energia;

/**
 * Fábrica Concreta 2: Solo sabe crear componentes eólicos.
 */
public class EolicaFactory implements EstacionFactory {

    @Override
    public CapturadorEnergia crearCapturador() {
        // Retorna el producto específico de esta familia
        return new TurbinaViento();
    }

    @Override
    public ReguladorVoltaje crearRegulador() {
        // Retorna el producto específico de esta familia
        return new ReguladorFrenado();
    }
}
