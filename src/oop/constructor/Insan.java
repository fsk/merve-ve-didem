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
        System.out.println("Bos constructor calisti.");
        //System.out.println("""
        //        Insan classindan bir tane
        //        instnace olusturuldu
        //        """);
    }

    public Insan(int age, String name) {
        if (name.length() < 2) {
            System.out.println("Gecersiz isim girdiniz.");
        }
        yas = age;
        isim = name;

        System.out.println("Dolu Constructor calisti");
    }

    /**
     * this
     */
    public Insan(String soyisim, char cinsiyet) {
        this.soyisim = soyisim;
        this.cinsiyet = cinsiyet;
    }

    /**
     * ALT + INSERT
     */
    public Insan(String isim, String soyisim) {
        System.out.println("2 parametre alan constructor.");
        this.isim = isim;
        this.soyisim = soyisim;
    }

    //Static Blcock
    static {
        System.out.println("Static block calisti.");
    }

    public Insan(int yas, String isim, String soyisim) {
        this(isim, soyisim);
        this.yas = yas;
        System.out.println("3 parametre alan constructor.");
    }

    public Insan(int yas, String isim, String soyisim, char cinsiyet) {
        this(yas, isim, soyisim);
        this.cinsiyet = cinsiyet;
        System.out.println("4 parametre alan constructor.");
    }


    //Instance inital Blcok
    {
        System.out.println("Instance inital block calisti.");
    }

}
