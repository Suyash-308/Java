import java.util.HashSet;
import java.util.Objects;

public class DemoSetHash {
    public static void main(String[] args) {
        HashSet hashSet=new HashSet<>();
        hashSet.add(10);
        hashSet.add("hii");
        hashSet.add(90);
        hashSet.add(null);
        System.out.println(hashSet);
    }
}
