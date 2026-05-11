public class Demo$1 {
                public static void main(String[] args) {
        Do_g d = new Do_g();
        d.sound();
    }
    }
    class Animals {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    class Do_g extends Animals {
        void sound() {
            System.out.println("Dog barks");
    }
}
