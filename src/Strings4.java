public class Strings4 {
    static void main() {
//        String str="hello";
//        for (int i = str.length()-1; i >= 0; i--) {
//            System.out.println(str.charAt(i));
//    }



            StringBuilder sb=new StringBuilder("Hello");
            for (int j = 0; j <sb.length()/2 ; j++) {
                int front=j;
                int back=sb.length()-1-j;

                char frontChar= sb.charAt(front);
                char backChar=sb.charAt(back);

                sb.setCharAt(front,backChar);
                sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);
    }
}
