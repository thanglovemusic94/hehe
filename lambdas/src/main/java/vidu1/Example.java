package vidu1;

public class Example {
    public static void main(String[] args) {
        SayHello sh = () -> {
            System.out.println("hello");
        };
        sh.say();


    }
}
