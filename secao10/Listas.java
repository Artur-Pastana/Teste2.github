package secao10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) {
        
        List<String> lista = new ArrayList<>();

        System.out.println(lista.size());
        
        lista.add("Artur");
        lista.add("Aslan");
        lista.add("Iris");

        System.out.println(lista);

        lista.add(2, "Maria");
        System.out.println(lista);

        lista.removeIf(x -> x.charAt(0) == 'A');
        System.out.println(lista);

        System.out.println("indice de Maria: "+ lista.indexOf("Maria"));

        System.out.println("indice de Maria: "+ lista.indexOf("Artur"));
        lista.add("Anne");
        lista.add("Andreza");

        System.out.println(lista);

        List<String> res = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        System.out.println(res);

        String nome = lista.stream().filter(x -> x.charAt(0) == 'g').findFirst().orElse(null);
        System.out.println(nome);



    }

    public static void mostrar(List<String> lista) {
        for (String obj : lista) {
            System.out.println(obj);
        }
        System.out.println();
    }
}