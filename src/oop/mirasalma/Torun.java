package oop.mirasalma;


/**
 * Method Overriding: Bir classin icinde bulunan
 * methodun alt class'i tarafindan ezilmesi /
 * yeniden yazilmasi
 *
 * -> Java'da bir class sadece bir tane classi extend alabilir.
 * -> Javadaki butun class'lar Object classinin bir alt classidir.
 */
public class Torun extends Dede {

    float boy;
    int ayakkabiNumarasi;

    @Override //Annotation
    public void arabaSur() {
        System.out.println("Torun dededen daha iyi" +
                "araba suruyor.");
        //super.arabaSur();

    }


}
