package usodelistas;

import java.util.Scanner;

public class UsodeListas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista nuevaLista = new Lista();
        Scanner myObj = new Scanner(System.in);
        nuevaLista.insertarF("fabrizio", 12);
        nuevaLista.insertarF("angelo", 20);
        nuevaLista.insertarF("alvaro", 20);
        nuevaLista.imprimirLista();
        System.out.println("");
        nuevaLista.eliminar("ad");
        System.out.println("");
        nuevaLista.imprimirLista();
        nuevaLista.insertarF("pedro", 20);
        System.out.println("");
        nuevaLista.imprimirLista();
        
    }
}
