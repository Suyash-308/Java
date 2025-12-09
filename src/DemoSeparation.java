public class DemoSeparation {
    public static void main(String[] args) {
        int number=894567982;
        int sum=0;

       int digit= number % 10;
       sum+=digit;

       number =number/10;
       digit=number%10;
       sum+=digit;

        number =number/10;
        digit=number%10;
        sum+=digit;

        number =number/10;
        digit=number%10;
        sum+=digit;

        number =number/10;
        digit=number%10;
        sum+=digit;
        number =number/10;
        digit=number%10;
        sum+=digit;

        number =number/10;
        digit=number%10;
        sum+=digit;
        number =number/10;
        digit=number%10;
        sum+=digit;

        number =number/10;
        digit=number%10;
        sum+=digit;

        System.out.println("Sum of digit is "+sum);

    }
}
