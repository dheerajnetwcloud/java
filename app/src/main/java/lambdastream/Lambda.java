package lambdastream;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class Lambda {
    public static void main(String[] args) {

        //Example of Consumer interface
        Stream.of(1,2,3,4).forEach(a-> System.out.print(" Hey::"+a));

        System.out.println(" ");

        //You can assign a consumer to a variables
        Consumer<Integer> consumer = (a-> System.out.print(" Hi :: "+ a));
        Stream.of(1,2,3,4,5).forEach(consumer);
    }


}
