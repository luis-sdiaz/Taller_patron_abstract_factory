package ucc.energia;

/**
 * Producto Concreto B2: Implementa la regulación de energía eólica.
 */
public class ReguladorFrenado implements ReguladorVoltaje {
    @Override
    public void estabilizar() {
        System.out.println("⚙️ [SISTEMA EÓLICO] Aplicando freno electromagnético para mantener 60Hz.");
        System.out.println("⚙️ [SISTEMA EÓLICO] Voltaje estabilizado: Protegiendo la red de ráfagas de viento.");
    }
}
