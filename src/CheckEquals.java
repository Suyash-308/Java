public class CheckEquals {

    public static void main(String[] args) {

        int a=10;
        int b=10;

        String d="hello";
        String f="hello";
        String s=new String("hello");
        System.out.println(a==b);
        System.out.println(d.equals(f));
        System.out.println(d.equals(s));
        System.out.println(d==s);


    }

}
