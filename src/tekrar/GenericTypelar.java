package tekrar;

public class GenericTypelar<T> {

    public void dongu(T deger[]) {
        for (T item : deger) {
            System.out.println(item);
        }
    }
}
