package Strings;

public class Demo1 {
    static void main() {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        System.out.println(stringBuilder);

        System.out.println(stringBuilder.charAt(0));

        stringBuilder.setCharAt(0,'T');
        System.out.println(stringBuilder);

        stringBuilder.insert(0,'S');
        System.out.println(stringBuilder);

        stringBuilder.insert(stringBuilder.length()-1,'y');
        System.out.println(stringBuilder);

        stringBuilder.delete(2,stringBuilder.length());
        System.out.println(stringBuilder);

        System.out.println(stringBuilder.length());
    }
}
