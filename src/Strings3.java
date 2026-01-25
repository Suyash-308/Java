public class Strings3 {
    static void main() {
        StringBuilder sb=new StringBuilder("Hello");
        sb.setCharAt(0,'h');
        System.out.println(sb);

        sb.insert(0,'S');
        System.out.println(sb);

        sb.insert(6,'!');
        System.out.println(sb);

        sb.delete(0,1);
        System.out.println(sb);
    }
}
