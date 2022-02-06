package clases;

public class naveNoTripulada extends Nave {
    private int numeroCamaras;

    public naveNoTripulada(String nombre, String tipo, String nacionalidad, int numPropulsores, int peso, int numeroCamaras) {
        super(nombre, tipo, nacionalidad, numPropulsores, peso);
        this.numeroCamaras = numeroCamaras;
    }
    public naveNoTripulada(){

    }

    public int getNumeroCamaras() {
        return numeroCamaras;
    }

    public void setNumeroCamaras(int numeroCamaras) {
        this.numeroCamaras = numeroCamaras;
    }

    public naveNoTripulada(int numeroCamaras) {
        this.numeroCamaras = numeroCamaras;
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

    public void regresar() {
        System.out.println("Recalculando ruta");
        for (int i = 0; i < 5; i++) {
            System.out.println(".");
        }
        System.out.println("Regresando a casa");
    }
}
