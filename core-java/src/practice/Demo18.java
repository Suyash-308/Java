package practice;

import java.io.File;
import java.io.IOException;

public class Demo18 {
    public static void main(String[] args) throws IOException {
        File file=new File("abc.txt");
        if (file.createNewFile()){
            System.out.println("File created");
        }else {
            System.out.println("Already exist");
        }
    }
}
