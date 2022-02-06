package clases;

public abstract class Nave {


    private String nombre;
    private String tipo;
    private String nacionalidad;
    private int numPropulsores;
    private int peso;

    public Nave(String nombre, String tipo, String nacionalidad, int numPropulsores, int peso) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nacionalidad= nacionalidad;
        this.numPropulsores = numPropulsores;
        this.peso = peso;
    }

    public Nave() {
    }

    public abstract void despegar();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumPropulsores() {
        return numPropulsores;
    }

    public void setNumPropulsores(int numPropulsores) {
        this.numPropulsores = numPropulsores;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
