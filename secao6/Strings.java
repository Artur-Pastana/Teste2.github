package secao6;

public class Strings {
    public static void main(String[] args) {
        
        String original = "abcd FGHIJ ABC abc DEFG";

        String s = "Artur da gloria + / * - Pastana";
        String[] lista = s.split(" ");

        System.out.println(lista[0]);
        System.out.println(lista[1]);
        System.out.println(lista[2]);

        for(int i = 0; i <= s.length(); i++){
            System.out.println(lista[i]);
        }
    }
}