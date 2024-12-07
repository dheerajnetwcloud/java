package generics;

public class TestTuple {
    public static void main(String[] args) {
        Tupple<String, Integer> tupple = new Tupple<>("Hello", 2);
        tupple.printInstance();
        tupple.print("Now you can see me", " :: two");

    }
}
