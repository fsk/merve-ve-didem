package oop.polymorphism;


/**
 * -- Polymorphism --
 * Tanım1: Alt sınıfa ait bir nesne üst sınıfa ait bir nesne olarak gösterilebilir.
 * Tanım2: Üst sınıf deişkeninin alt sınıf nesnelerini referans edebilmesi polymorphismdir.
 *
 *
 * Static Binding ve Early Binding nedir.?
 * Polymorphismin yararları
 * Polymorphism olmasaydı polymorphik yapıyı nasıl sağlardık.
 */

public class Main2 {

    public static void main(String[] args) {

        GeometrikSekil instance = new Kare();
        instance.gs();

        System.out.println("----------------");
        GeometrikSekil instance2 = new Daire();
        //---------------------------------------------------------
        Object nesne = new GeometrikSekil();
        String res = nesne.toString();
        System.out.println(res);



    }
}

class GeometrikSekil {
    public void method() {
        System.out.println("Geometrik sekil methodu");
    }

    public void gs() {
        System.out.println("Geometrik Sekil classi icindeyiz.");
    }

    @Override
    public String toString() {
        return "Bu geometrik sekil classinin icerisindeki toString methodudur.";
    }
}

class Kare extends GeometrikSekil {

    @Override
    public void method() {
        System.out.println("Kare method");
    }

    public void kare() {
        System.out.println("Kare classi icindeyiz.");
    }
}

class Daire extends GeometrikSekil {

    @Override
    public void method() {
        System.out.println("Daire methodu");
    }

    public void daire() {
        System.out.println("Daire classi icindeyiz.");
    }
}
