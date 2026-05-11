package practice;

public class Demo16 {

        public static void main(String[] args) {
            StringBuffer sb = new StringBuffer("Hello");

            sb.append(" World");
            System.out.println(sb);

            sb.insert(5, " Java");
            System.out.println(sb);

            sb.replace(0, 5, "Hi");
            System.out.println(sb);

            sb.delete(2, 7);
            System.out.println(sb);  // Output: Hi World
    }
}
