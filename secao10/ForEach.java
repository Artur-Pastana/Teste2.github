package secao10;

public class ForEach {
    public static void main(String[] args) {
        
        String[] lista = new String[]{"Artur","Aslan","Iris","Maria"};

        for (int i = 0; i < lista.length; i++) {
            System.out.printf("lista[%d]: %s%n",i,lista[i]);
        }
        System.out.println("-----------------------------");
        for (String nomes : lista) {
            System.out.printf("%s%n", nomes);
        }
    }
}