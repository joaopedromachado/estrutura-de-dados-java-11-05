package mapas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mapa {
    private static List<String> listKeys = new ArrayList<>();
    private static Map<String, Integer> mapa = mapaPalavras(listKeys);

    public static void main(String[] args) {
        listKeys.add("Joao");
        listKeys.add("Pedro");
        listKeys.add("Matheus");
        listKeys.add("Carlos");
        listKeys.add("Pedro");
        listKeys.add("Irineu");
        listKeys.add("Gregory");
        listKeys.add("Pedro");
        listKeys.add("Joao");
        listKeys.add("Irineu");

        mapa = mapaPalavras(listKeys);

        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

    public static Map<String, Integer> mapaPalavras(List<String> listKeys){
        mapa = new HashMap<>();

        for(String key : listKeys){
            if (mapa.containsKey(key)){
                int qtd = mapa.get(key);
                put(key, qtd+1);
            } else {
                put(key, 1);
            }
        }
        return mapa;
    }

    public static void put(String key, Integer value){
        mapa.put(key, value);
    }

    public static Integer get(String key){
        return mapa.get(key);
    }

    public static void remove(String key){
        mapa.remove(key);
    }

}
