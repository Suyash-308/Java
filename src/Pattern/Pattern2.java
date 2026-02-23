package Pattern;

public class Pattern2 {
    static void main() {
        int n=5;
        for (int i =1; i<=n ; i++) {
            for (int j = 1; j<=n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
