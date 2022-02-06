package clases;

public class NaveLanzadera extends Nave {
    private String estabilizador;

    public String getEstabilizador() {
        return estabilizador;
    }

    public void setEstabilizador(String estabilizador) {
        this.estabilizador = estabilizador;
    }

    public NaveLanzadera(String nombre, String tipo, String nacionalidad, int numPropulsores, int peso, String estabilizador) {
        super(nombre, "Nave Lanzadera", nacionalidad, numPropulsores, peso);
        this.estabilizador = estabilizador;
    }

    public NaveLanzadera() {
    }

    @Override
    public void despegar() {
        System.out.println("Iniciando despegue");
        for (int i = 3; i >= 0; i--) {
            System.out.println("t-" + i);
        }
        System.out.println("despegue iniciado..");
        for (int i = 0; i < 5; i++) {
            System.out.println(".");

        }
        System.out.println("Despegue exitoso");
    }

    public void desprenderse() {
        System.out.println("Iniciando desprendimiento en:");
        for (int i = 3; i >= 0; i--) {
            System.out.println("t-" + i);
        }
        System.out.println("Soltado modulos..");
        for (int i = 0; i < 5; i++) {
            System.out.println(".");
        }
        System.out.println("Desprendimiento por modulos finalizado");
    }

    public void regresar() {
        System.out.println("Recalculando ruta");
        for (int i = 0; i < 5; i++) {
            System.out.println(".");
        }
        System.out.println("Regresando a casa");
    }

}
