package listas;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    private static List<String> elements = new ArrayList<>();

    public static void main(String[] args) {
        addElementEnd("João");
        addElementEnd("Maria");
        addElementEnd("Marcos");
        addElementStart("Bartolomeu");
        addElementEnd("Robert Martin");
        addElementStart("Chico Bento");

        searchByElementAndReturnPosition("Maria");

        removeElement(2);

        getListNames();
    }

    public static void addElementEnd(String element){
        elements.add(element);
    }

    public static void addElementStart(String element){
        elements.add(0, element);
    }

    public static void getListNames(){
        elements.forEach(element -> System.out.println(element));
    }

    public static void searchByElementAndReturnPosition(String element){
        System.out.println(elements.indexOf(element));
    }

    public static void removeElement(int index){
        System.out.println("Removido: " + elements.get(index));
        elements.remove(index);
    }

}
