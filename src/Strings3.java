public class Strings3 {
    public static void main(String[] args)  {
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
