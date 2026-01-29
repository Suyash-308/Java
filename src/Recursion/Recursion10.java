package Recursion;

public class Recursion10 {
    static void main() {
        String str="abxcxxd";
        moveAllX(str,0,0,"");


    }
    public static void moveAllX(String str,int i,int count,String newStr){
        if (i==str.length()){
            for (int j= 0; j <count ; j++) {
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }

        char currentChar=str.charAt(i);
        if (currentChar=='x'){
            count++;
            moveAllX(str,i+1,count,newStr);
        }else {
            newStr +=currentChar;
            moveAllX(str,i+1,count,newStr);
        }

    }
}
