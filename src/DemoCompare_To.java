public class DemoCompare_To {
    public static void main(String[] args) {
        String b="Hello";
        String a="Hello";

        int r=20;
        int q=30;

        int result=Integer.compare(q,r);

        System.out.println(result);
        System.out.println(a.compareTo(b));


//        If      first >  second --->  positive value
//                first <  second --->  negative value
//                 first =  second --->   0
    }
}
