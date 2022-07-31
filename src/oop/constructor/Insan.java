package oop.constructor;
/**
 * -- Constructor Method --
 * 1) Constructor method, classin instancei olusturuldugunda
 * tetiklenen ilk methoddur.
 * 2) Genellikle publictir.
 * 3) Geriye deger dondurmez. (void de degildir.)
 * 4) Constructor method ismi class ismiyle
 * ayni olmak zorunda.
 * 5) Birden fazla constructor method olabilir.
 * 6) Parametre alabilir. Buna dolu constructor denir.
 * 7) Parametre almayabilir. Buna bos constructor denir.
 * 8) Javada yazsak da yazmasak da otomatik olara
 * bos constructor olusturulur.
 */
public class Insan {

    int yas;
    String isim;
    String soyisim;
    char cinsiyet;

    public Insan() {

        System.out.println("""
                Insan classindan bir tane 
                instnace olusturuldu
                """);

    }



}
