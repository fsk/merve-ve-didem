package ders2;

import java.util.Arrays;

/**
 * 1) Aynı veri tipine sahip dataların bir arada bulundugu yapilar
 * 2) Diziler REFERENCE TYPE verilerdir.
 * 3) Dizilere baslangic degeri verilmesi zorunludur. Yani, kac eleman tutacagi onceden bilinmeli.
 * 4) Diziler index bazli calisir.
 * 5) For Dongusu index bazli calisirken, forEach icerik bazli calisir.
 */
public class Main {

    public static void main(String[] args) {

        /**
         * dataType[] arrName;
         * dataType []arrName;
         * dataType arrName[];
         */

        int[] arrName = new int[5];
        //int a = 50;
        System.out.println(arrName);
        System.out.println(arrName[3]);

        long []arrName2;
        arrName2 = new long[10];

        //long number;
        //number = 100;

        String isimler[] = {"Furkan", "Didem", "Merve", "Fatih Terim", "Sefa"};
        System.out.println(isimler);
        System.out.println(isimler[3]);

        System.out.println("--------------------------------");

        int[] sayilar1 = {1,2,3,4,5};
        int[] sayilar2 = {10,20,30,40,50};

        sayilar1 = sayilar2;

        System.out.println("Sayilar1: " + sayilar1);
        System.out.println("Sayilar2: " + sayilar2);

        System.out.println(sayilar2[2]);
        System.out.println(sayilar1[2]);


        System.out.println("-------------------------");

        //FOR DONGUSU
        System.out.println("-- For Dongusu --");
        for (int i = 0; i < isimler.length; i++) {
            System.out.print(isimler[i] + " ");
        }

        System.out.println("\n");


        //FOR EACH DONGUSU
        System.out.println("-- For Each Dongusu --");
        for (String item : isimler) {
            System.out.println(item);
        }

        System.out.println("--------------------------");

        System.out.println("-- For Dongusu Kare Alma --");
        int number[] = {1,2,3,4,5};

        for (int i = 0; i < number.length; i++) {
            number[i] = (int)Math.pow(i, 2);
        }


        for (int i = 0; i < number.length ; i++) {
            System.out.println(number[i]);
        }

        System.out.println("\n");

        System.out.println("-- For Each Dongusu Kare Alma --");
        int number2[] = {1,2,3,4,5};

        for (int item : number2) {
            //System.out.println(item);
            //number2[item] = (int)Math.pow(item, 2);
        }

        //for (int item : number2) {
        //    System.out.println(item);
        //}


        //Arrays Classi

        int[] number3 = {3,1,4,-5,7,9,8};
        int[] number4 = {3,1,4,-5,7,9,8};

        System.out.println("--");
        System.out.println(Arrays.equals(number3, number4));

        System.out.println(Arrays.compare(number3, number4));
        System.out.println("--");

        if (number3.equals(number4)) {
            System.out.println("***true***");
        }else System.out.println("***false***");

        Arrays.sort(number3);

        for (int it : number3) {
            System.out.println(it);
        }

    }
}
