package oop.polymorphism;

public class Main1 {

    public static void main(String[] args) {

        Hayvan hayvan = new Hayvan();
        Kedi kedi = new Kedi();
        Kopek kopek = new Kopek();
        hayvan.adiniSoyle();
        kedi.adiniSoyle();
        kopek.adiniSoyle();

        System.out.println("-----------------------");


        adiniGetir(hayvan);
        //UPCASTING
        adiniGetir(kedi);
        adiniGetir(kopek);



    }

    public static void adiniGetir(Hayvan param) {
        param.adiniSoyle();
    }


}

class Hayvan {
    public void hayvanMethod() {
        System.out.println("Bu hayvan classina ait bir methoddur.");
    }

    public void adiniSoyle() {
        System.out.println("Hayvan adini soyluyor.");
    }
}

class Kedi extends Hayvan {

    public void kediMethod() {
        System.out.println("Bu kedi classina ait bir methoddur.");
    }

    @Override
    public void adiniSoyle() {
        System.out.println("Kedi adini soyluyor.");
    }
}

class Kopek extends Hayvan {

    public void kopekMethod() {
        System.out.println("Bu kedi classina ait bir methoddur.");
    }

    @Override
    public void adiniSoyle() {
        System.out.println("Kopek adini soyluyor.");
    }
}
