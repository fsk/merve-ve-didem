package oop.classlaragiris;

public class Araba {

    //fieldlar
    int tekerlekSayisi = 4;
    int yolcuKapasitesi;
    String renk;
    String marka;
    int model;


    //methodlar

    /**
     * Methodlar davranir.
     * -> Database'e baglan
     * -> Listele
     * -> Sil
     * -> Getir
     * -> Guncelle
     * -> Temiz kod yazma standartlarina gore
     * methodlar fiil bildirmelidir.
     */
    public void arabayiCalistir() {
        System.out.println(marka + " marka Araba Calisiyor.");
    }

    public void arabayiDurdur() {
        System.out.println(marka + " marka Araba duruyor.");
    }


}
