package clases;

public class naveTripulada extends Nave {
    private int numTripulantes;
    private int numAreas;



    @Override
    public void despegar() {
        System.out.println("Iniciando despegue");
        for (int i = 3; i >= 0; i--) {
            System.out.println("t-"+i);
        }
        System.out.println("despegue iniciado..");
        for (int i = 0; i < 5; i++) {
            System.out.println(".");

        }
        System.out.println("Despegue exitoso");
    }

    public void acoplarse() {
        System.out.println("Iniciando acoplamiento");
        for (int i = 3; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("Acoplando..");
        for (int i = 0; i < 5; i++) {
            System.out.println(".");

        }
        System.out.println("Acoplado correctamente");
    }

    public void desacoplarse() {
        System.out.println("Iniciando desacoplamiento en:");
        for (int i = 3; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("Desacoplando..");
        for (int i = 0; i < 5; i++) {
            System.out.println(".");
        }
        System.out.println("Desacoplado correctamente");
    }

    public void regresar() {
        System.out.println("Recalculando ruta");
        for (int i = 0; i < 5; i++) {
            System.out.println(".");
        }
        System.out.println("Regresando a casa");
    }

    public naveTripulada() {
    }

    public naveTripulada(String nombre, String tipo, String nacionalidad, int numPropulsores, int peso, int numAreas, int numTripulantes) {
        super(nombre, tipo, nacionalidad, numPropulsores, peso);
        this.numAreas = numAreas;
        this.numTripulantes = numTripulantes;
    }


}
