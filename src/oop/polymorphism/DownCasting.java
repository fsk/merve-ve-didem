package oop.polymorphism;

public class DownCasting {

    public static void main(String[] args) {

        //Object instance = new Ogretmen();

        //Asagidaki kod blogu ClassCastException hatasi atar.
        //Mudur instance = (Mudur) new Ogretmen();
        //instance.mudurMethod();

        Ogretmen instance = new Mudur();
        Mudur instance2 = (Mudur) instance;
        instance2.mudurMethod();

    }
}

class Ogretmen {
    public void dersAnlat() {
        System.out.println("Ogretmen ders anlatiyor.");
    }

    public void ogretmenMethod() {
        System.out.println("Ogretmen method");
    }
}

class Mudur extends Ogretmen{
    @Override
    public void dersAnlat() {
        System.out.println("Mudur ders anlatiyor.");
    }

    public void mudurMethod() {
        System.out.println("Mudur method");
    }
}

