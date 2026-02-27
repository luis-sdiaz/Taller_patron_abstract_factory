package ucc.energia;

/**
 * Producto Concreto A2: Implementa la captura de energía eólica.
 */
public class TurbinaViento implements CapturadorEnergia {
    @Override
    public void recolectar() {
        System.out.println("🌬️ [SISTEMA EÓLICO] Aspas girando... Convirtiendo energía cinética del viento.");
        System.out.println("🌬️ [SISTEMA EÓLICO] Generando electricidad mediante inducción magnética.");
    }
}
