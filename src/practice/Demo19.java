package practice;

import java.io.FileWriter;
import java.io.IOException;

public class Demo19 {
    public static void main(String[] args) throws IOException {
        FileWriter writer=new FileWriter("abc.txt");
        writer.write("Hello World !");
        writer.close();

    }
}
