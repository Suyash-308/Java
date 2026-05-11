public class Demo2Separation {
    public static void main(String[] args) {
        int num=7485;
        int sum=0;

        while (num!=0){
          int  digit=num %10;
            sum+=digit;
            num=num/10;
        }
        System.out.println(sum);
    }
}
