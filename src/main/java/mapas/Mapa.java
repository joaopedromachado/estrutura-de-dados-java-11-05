package mapas;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    private static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        map.put("João", 23);
        map.put("Marcelo", 18);
        map.put("Rafaela", 20);
        map.put("dfdf", 17);

        System.out.println(map.entrySet());
    }
}
