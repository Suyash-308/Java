import java.util.LinkedHashSet;

public class DemoLInkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Object> linkedHashSet =new LinkedHashSet<>();
        linkedHashSet.add("hello");
        linkedHashSet.add(20);
        linkedHashSet.add(83);
        linkedHashSet.add(null);
        System.out.println(linkedHashSet);
    }
}
