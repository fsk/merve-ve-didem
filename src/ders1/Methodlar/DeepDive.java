package ders1.Methodlar;


import java.util.Arrays;

/**
 * Method Overloading
 * Varargs
 */
public class DeepDive {

    public static void main(String[] args) {
        /**
         * Integer, Long, Short, Double, Float, String ...
         * Math, Arrays, Collections,
         */

        topla(3,4);

        topla(3,4, 5);

        topla(5.7, 3);

        topla(3,4, 8, 10);


        topla(3,"78");

        int res1 = topla(5,4,3,2,1,5,6,7,8,9,1,2,6,356,456,34,535);
        int res2 = topla(5,4,3,2,1,5,6,7,8,9,1,2,6,356);

        System.out.println(res1);
        System.out.println(res2);


    }

    public static int topla(int a, int b) {
        return a + b;
    }

    public static int topla(int a, int b, int c) {
        return a + b + c;
    }

    public static int topla(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static int topla(double a, int b) {
        return (int) a + b;
    }

    public static int topla(double a, String b) {
        return (int) a + Integer.parseInt(b);
    }

    public static int topla(int... params) {
        int toplam = 0;
        for (int item : params) {
            toplam = toplam + item;
        }
        return toplam;
    }
}
