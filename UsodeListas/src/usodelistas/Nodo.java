package usodelistas;

public class Nodo {
    private String nombre;
    private int nota;
    private Nodo sgte;

    public void Nodo() {
        this.nombre = "";
        this.nota = -1;
        this.sgte = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Nodo getSgte() {
        return sgte;
    }

    public void setSgte(Nodo sgte) {
        this.sgte = sgte;
    }
    
}