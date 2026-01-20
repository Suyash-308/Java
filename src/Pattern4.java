public class Pattern4 {
    static void main() {
       int n=40;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j =1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
