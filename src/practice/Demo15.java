package practice;

public class Demo15 {
    public static void main(String[] args) {
        String string="Hello Suyash";

        string.toLowerCase();
        int vowels=0;

        for (int i = 0; i <string.length() ; i++) {
           char ch= string.charAt(i);
            if (ch>='a' && ch<='z'){
                if (ch=='a' || ch=='e'|| ch=='i'|| ch=='o'||ch=='u'){
                    vowels++;
                }
            }
        }
        System.out.println(vowels);
    }
}
