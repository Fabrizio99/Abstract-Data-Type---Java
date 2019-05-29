package usodelistas;

public class Lista {

    private Nodo top;
    private int tamaño;

    public void Lista() {
        this.top = null;
        this.tamaño = 0;
    }

    public boolean esVacia() {
        return top == null;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public void insertarF(String nombre, int nota) {
        Nodo nuevoN = new Nodo();
        nuevoN.setNombre(nombre);
        nuevoN.setNota(nota);
        if (esVacia()) {
            top = nuevoN;
        } else {
            Nodo auxiliar = top;
            while (auxiliar.getSgte() != null) {
                auxiliar = auxiliar.getSgte();
            }
            auxiliar.setSgte(nuevoN);
        }
        this.tamaño++;
    }

    public void insertarI(String nombre, int nota) {
        Nodo nuevoN = new Nodo();
        nuevoN.setNombre(nombre);
        nuevoN.setNota(nota);
        if (esVacia()) {
            top = nuevoN;
        } else {
            nuevoN.setSgte(top);
            top = nuevoN;
        }
        this.tamaño++;
    }

    public void imprimirLista() {
        Nodo auxiliar = top;
        while (auxiliar != null) {
            System.out.print(auxiliar.getNombre() + "-" + auxiliar.getNota() + "->");
            auxiliar = auxiliar.getSgte();
        }
    }

    public void eliminar(String nombre) {
        if (esVacia()) {
            System.out.println("No hay elementos en la lista");
        } else {
            if (top.getNombre().equals(nombre)) {
                top = top.getSgte();
            } else {
                Nodo temporal = top;
                while (temporal.getSgte() != null && !(temporal.getSgte().getNombre().equals(nombre))) {
                    temporal = temporal.getSgte();
                }
                if (temporal.getSgte() == null) {
                    System.out.println("no existe");
                } else {
                    temporal.setSgte(temporal.getSgte().getSgte());
                }
            }
            tamaño--;
        }
    }
}
