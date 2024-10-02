package lambdastream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateStreamsDemo {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("this", "is", "a", "Stream", "demo");

        createStreamFromAList(list);
        createStreamFromAListAndMap(list);
        createStreamUsingIterate();
        createStreamUsingGenerate();

    }

    private static void createStreamUsingGenerate() {
        Stream.generate(Math::random).limit(10).forEach(System.out::print);

        Double doubleOutput = Stream.generate(Math::random).limit(10).reduce(Double::sum).orElse(0.0);
        System.out.println(doubleOutput);

        doubleOutput = Stream.generate(Math::random).limit(10).reduce((aDouble, aDouble2) -> aDouble += aDouble2).orElse(0.0);
        System.out.println(doubleOutput);
    }

    private static void createStreamUsingIterate() {
        Stream.iterate(1, val -> val + 1).limit(10).forEach(System.out::print);
    }

    public static void createStreamFromAList(List<String> list){
        String output = list.stream().collect(Collectors.joining(" ->"));
        System.out.println(output);
    }
    public static void createStreamFromAListAndMap(List<String> list){
        String output = list.stream().map(String::toUpperCase).collect(Collectors.joining(" "));
        System.out.println(output);

        //Using Custom method
        output =list.stream().map(CreateStreamsDemo::toUpperCase).collect(Collectors.joining(" "));
        System.out.println(output);

    }

    public static String toUpperCase(String inp){
        return inp.toUpperCase();
    }
}
