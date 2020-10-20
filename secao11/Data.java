package secao11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date y1 = sdf1.parse("19/10/2020");

        Date y2 = sdf2.parse("19/10/2020 20:23:28");

        System.out.println("y1: "+sdf1.format(y1));

        System.out.println("y2: "+sdf2.format(y2));

        Date data = new Date();
        System.out.println("data: "+sdf2.format(data));
        System.out.println(data);
    }
}