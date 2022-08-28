package tekrar;

import java.util.ArrayList;

/**
 * var keyword
 * -> var keyword'u bir data type degildir.
 * -> esitligin sagindaki ifade neyse ona gore davranir.
 * -> var ile tanimlanmis bir deger local degisken olarak kullanilabilir
 * ama global degisken olarak kullanilamaz.
 * -> var keywordu generic type olarak kullanilamaz.
 * -> var keywordu ilk deger atamasi olmadan kullanilamaz.
 * -> var keywordu lambda expressionlar ile kullanilamaz.
 * -> var keywordu methodlarda parametre type olamaz. ve return type olarak kullanilamaz.
 */
public class VarKeyword {



    public static void main(String[] args) {

        var number = 50;
        var name = "Merve";

        if (true) {
            var deger = false;
        }

        ArrayList degerler = new ArrayList();
        degerler.add(50);
        degerler.add("Merve");
        degerler.add(false);
        degerler.add(10.5);
        System.out.println(degerler);

        System.out.println("---------------------------");

        ArrayList<String> degerler2 = new ArrayList();
        degerler2.add("Merve");
        degerler2.add("Furkan");
        degerler2.add("Didem");

        System.out.println("---------------------------");

        GenericTypelar instance = new GenericTypelar();

        GenericTypelar<String> instance2 = new GenericTypelar<>();
        GenericTypelar<Integer> instance3 = new GenericTypelar<>();

        //var<var> instance4 = new var<>();
        //ArrayList<var> instance5 = new ArrayList<var>();
        //var<String> instance6 = new var<>();
        //var<Integer> al = new ArrayList<Integer>();

        //var name3;


    }

    /*public static var topla(int a, int b) {
        var total = a + b;
        return total;
    }*/


}
