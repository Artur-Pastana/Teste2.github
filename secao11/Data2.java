package secao11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Data2 {
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2020-10-19T20:39:28Z"));

        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance();

        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 3);
        d = cal.getTime();

        System.out.println(sdf.format(d));

        int minutos = cal.get(Calendar.MINUTE);
        System.out.println("minutos: "+minutos);

        int mes = 1 + cal.get(Calendar.MONTH);
        System.out.println("mes: "+mes);

        Date data = new Date();
        System.out.println(sdf.format(data));

        int segundos = data.getSeconds();
        System.out.println("segundos: "+segundos);
    }
}