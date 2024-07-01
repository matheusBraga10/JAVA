package jogoDasPalavrasEmbaralhadas.mecanica;

public class FabricaMecanicaDoJogo  {

private static MecanicaDoJogo mecanicaDoJogo;
    
    public static MecanicaDoJogo get() {
        return  mecanicaDoJogo;
    }

    public static void set(MecanicaDoJogo mecanicaDoJogo) {
        FabricaMecanicaDoJogo.mecanicaDoJogo = mecanicaDoJogo;
    }
}
