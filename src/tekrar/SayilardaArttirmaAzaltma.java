package tekrar;

import java.time.LocalDate;
import java.time.Month;

public class SayilardaArttirmaAzaltma {

    public static void main(String[] args) {


        int meal = 5;
        int tip = 2;
        var total = meal + (meal>6 ? tip++ : tip--);
        System.out.println("Total: " + total);
        System.out.println("Tip: " + tip);


        /*
        int number = 50;
        number++;
        System.out.println(number);

        int number2 = 10;
        ++number2;
        System.out.println(number2);

        int number3 = 100;
        System.out.println(number3++);

        int number4 = 250;
        System.out.println(++number4);

        //System.out.println(number3);
        */

        int year = 1874;
        Month month = Month.APRIL;
        int day = 24;
        LocalDate date = LocalDate.of(year, month, day);
        System.out.println(date.isBefore(LocalDate.now()));


        /*
        var b = "12";
        b += "3";
        b.reverse();
        System.out.println(b.toString());
         */


        var line = new StringBuilder("-");
        var anotherLine = line.append("-");
        System.out.print(line == anotherLine);
        System.out.print(" ");
        System.out.print(line.length());


    }
}
