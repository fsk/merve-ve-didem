package ders1.Methodlar;

public class ParametreAlanGeriyeDegerDonduren {

    public static void main(String[] args) {
        int sayi = 12;
        topla(7,5);

        int sonuc = sayi + topla(4,3);
        System.out.println(sonuc);

        String res = topla2(new Integer(7), new Double(4.7), new Float(3.4), new Long(6));
        System.out.println(res);
    }


    public static int topla(int a, int b) {
        return a + b;
    }

    public static String topla2(Integer sayi1,
                                Double sayi2,
                                Float sayi3,
                                Long sayi4) {

        Integer sonuc = sayi1.intValue() + sayi2.intValue() + sayi3.intValue() + sayi4.intValue();
        return sonuc.toString();
    }
}
