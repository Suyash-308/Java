import java.io.File;
import java.io.IOException;

public class DemoFIle {
    public static void main(String[] args) throws IOException {
        File f=new File("abc");

        System.out.println( f.renameTo(new File("xyz.txt")));


    }
}
