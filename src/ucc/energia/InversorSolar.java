package ucc.energia;

public class InversorSolar implements
        ReguladorVoltaje {
    @Override
    public void estabilizar() {
        System.out.println("⚡ [SOLAR] Inversor activo: Sincronizando onda senoidal a 60Hz.");
    }
}