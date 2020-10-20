package secao6;

public class OpeBitWise {
    public static void main(String[] args) {
        System.out.println("A   B   A & B");
        System.out.printf("V   V   %b  %n", true & true);
        System.out.printf("V   F   %b  %n", true & false);
        System.out.printf("F   V   %b  %n", false & true);
        System.out.printf("F   F   %b  %n", false & false);

        System.out.println();

        System.out.println("A   B   A | B");
        System.out.printf("V   V   %b  %n", true | true);
        System.out.printf("V   F   %b  %n", true | false);
        System.out.printf("F   V   %b  %n", false | true);
        System.out.printf("F   F   %b  %n", false | false);

        System.out.println();

        System.out.println("A   B   A ^ B");
        System.out.printf("V   V   %b  %n", true ^ true);
        System.out.printf("V   F   %b  %n", true ^ false);
        System.out.printf("F   V   %b  %n", false ^ true);
        System.out.printf("F   F   %b  %n", false ^ false);

        int a,b;
        a = 89;
        b = 60;
        System.out.printf("%d%n",a & b);
        b = 0b00100000;
        System.out.println(b);


    }
}