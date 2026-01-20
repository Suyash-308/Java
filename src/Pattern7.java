public class Pattern7 {
    static void main() {
        int n=5;
        for (int i =1; i <=n ; i++) {
            for (int j = 1; j <=n+1-i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
