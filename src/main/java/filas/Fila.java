package filas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {
    private static Queue<String> fila = new LinkedList<>();
    private static Queue<Integer> clientes = new LinkedList<>();

    public static void main(String[] args) {
        fila.add("João");
        fila.add("Robert");
        fila.add("Leandro");
        fila.add("Irineu");
//        fila.remove();

        fila.poll();
        System.out.println(fila);
        System.out.println(fila.element());

        clientes.add(4);
        clientes.add(1);
        clientes.add(14);
        clientes.add(6);
        clientes.add(23);
        System.out.println(clientes);

        while(!clientes.isEmpty()){
            System.out.println("Cliente atual: " + clientes.element());
            System.out.println("Atendimento encerrado, cliente N°" + clientes.element() + " saindo da fila...");
            clientes.remove();
            if (clientes.isEmpty()){
                System.out.println("\nNão existe mais pessoas nessa fila.");
            } else{
                System.out.println("\nPróximo cliente...");
            }
        }
        System.out.println(clientes);

    }

    public static boolean isEmpty(){
        return clientes.size() == 0;
    }

}
