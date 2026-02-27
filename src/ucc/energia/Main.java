package ucc.energia;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   SISTEMA DE CONTROL ENERGÉTICO - UCC    ");
        System.out.println("   Estudiante: Luis Sebastian Diaz        ");
        System.out.println("==========================================");

        // 1. PROBANDO LA CONFIGURACIÓN SOLAR
        System.out.println("\n[ESCENARIO 1: Instalación en el Desierto]");
        EstacionFactory fabricaSol = new SolarFactory();
        GestorEnergia plantaSolar = new GestorEnergia(fabricaSol);
        plantaSolar.operar();

        System.out.println("------------------------------------------");

        // 2. PROBANDO LA CONFIGURACIÓN EÓLICA
        System.out.println("[ESCENARIO 2: Instalación en la Costa]");
        EstacionFactory fabricaViento = new EolicaFactory();
        GestorEnergia plantaEolica = new GestorEnergia(fabricaViento);
        plantaEolica.operar();

        System.out.println("==========================================");
        System.out.println("   PROCESO FINALIZADO CON ÉXITO           ");
        System.out.println("==========================================");
    }
}