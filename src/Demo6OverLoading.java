public class Demo6OverLoading {
    public static void main(String[] args) {
       System.out.println(add( 20,15));
        System.out.println(add( 10,30,25));
        System.out.println(add( 10f,40f,25f));

    }

    public static int add(int a, int b){
        return a + b;
    }
    public static int add(int a, int b,int c){
        return a + b+c;
    }
        public static float add(float a, float b,float c){
        return a + b+c;
    }
}
