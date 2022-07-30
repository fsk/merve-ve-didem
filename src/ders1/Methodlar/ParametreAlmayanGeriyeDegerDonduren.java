package ders1.Methodlar;

import java.util.List;

public class ParametreAlmayanGeriyeDegerDonduren {

    public static void main(String[] args) {
        System.out.println("*****");
        int sayi = sayiDondur();
        System.out.println("Bu method geriye deger dondurur: " + sayiDondur());
        System.out.println("*****");


    }


    //Parametre almayan - Geriye Deger Dondurmeyen
    //public static void method(int a, String b)

    public static int sayiDondur() {
        return 10;
    }
}
