package Array;

public class Array2 {
    public static void main(String[] args) {
        String[] str={"hello","vCard","d4"};

//        Enhanced for loop
        for (String s:str){
            System.out.println(s);
        }

//          Traditional for loop
        for (int i = 0; i <str.length ; i++) {
            System.out.println(str[i]);
        }
    }
}
