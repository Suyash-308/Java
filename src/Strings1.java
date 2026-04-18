public class Strings1 {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="World";

        String str=str1+" "+str2;

        System.out.println(str);

        System.out.println(str.length());

        for (int i = 0; i <str.length() ; i++) {
            System.out.println(str.charAt(i));
        }
    }
}
