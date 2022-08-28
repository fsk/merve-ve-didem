package oop.constructor;

public class Main1 {

    /**
     * new anahtar kelimesi reference type
     * verilerle kullanilir.
     * new anahtar kelimesi ile heap alaninda
     * yeni bir alan olusturulacagi garanti edilir.
     *
     *
     * Reference typelarin default degerleri null dir.
     */
    public static void main(String[] args) {
        //ClassName instance = new ClassName();

        Insan didem = new Insan();


        //int number;
        //number = 50;
        //System.out.println(number);

        //System.out.println("------------");

        //Insan merve = null;
        //merve.cinsiyet = 'e';
        //System.out.println(merve.cinsiyet);


        Insan instance = new Insan();
        Insan instance2 = new Insan(28, "Furkan");
        System.out.println(instance2.yas);
        System.out.println(instance2.isim);

        System.out.println("------------");

        Insan instance3 = new Insan("Kulaksiz", 'E');
        System.out.println(instance3.cinsiyet);
        System.out.println(instance3.soyisim);

        System.out.println("------------");

        Insan instance4 = new Insan(28, "Furkan", "Kulaksiz", 'E');



    }
}
