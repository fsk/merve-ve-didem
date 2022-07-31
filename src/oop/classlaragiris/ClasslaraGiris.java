package oop.classlaragiris;

public class ClasslaraGiris {

    public static void main(String[] args) {

        //ClassName instance = new ClassName();
        Araba bmw = new Araba();
        //bmw.tekerlekSayisi = 10;
        bmw.yolcuKapasitesi = 5;
        bmw.renk = "Mat Siyah";
        bmw.marka = "BMW";
        bmw.model = 2022;

        bmw.arabayiCalistir();

        System.out.println("----------------");

        Araba mercedes = new Araba();
        //mercedes.tekerlekSayisi = 8;
        mercedes.yolcuKapasitesi = 6;
        mercedes.renk = "Kirmizi";
        mercedes.marka = "MERCEDES";
        mercedes.model = 2021;


        mercedes.arabayiCalistir();

        System.out.println("----------------");
        //System.out.println("BMW Arabasi -> " + bmw);
        //System.out.println("Mercedes Arabasi -> " + mercedes);

        System.out.println("----------------");

        System.out.println(bmw.marka);
        System.out.println(mercedes.marka);

        System.out.println("----------------------");

        System.out.println(bmw.tekerlekSayisi);
        System.out.println(mercedes.tekerlekSayisi);


    }

}
