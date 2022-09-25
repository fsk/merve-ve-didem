package oop.polymorphism;


/**
 * Polymorphism olmasaydi ne olurdu.
 * Polymprohism olmasaydi polimorfik yapiyi
 * nasil saglardik.? ( instance of - static - final )
 *
 */

public class Main3 {


    public static void main(String[] args) {

        Class1 instance = new Class2();
        instance.method1();
        instance.methodOne();


        //Class2 instance2 = new Class2();
        //Class2.staticMethod1();

        //Main3 instance3 = new Main3();
        //instance3.main(new String[]{});

        Class1 instance2 = new Class2();
        instance2.staticMethod1();



    }

}

