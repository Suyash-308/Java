public class Array2 {
    static void main() {
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
