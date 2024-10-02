package lambdastream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStream {
    public static void main(String[] args) {
        sortStringComparator();
        sortStringComparatorThenComparing();
        sortStringListUsingStream();
    }

    private static void sortStringListUsingStream() {
        List<String> sampleString = Arrays.asList("this is a string that i have written".split(" "));
        List<String> sortedList = sampleString.stream().sorted((a,b) -> a.length() - b.length()).toList();
        System.out.println(sortedList);
        List<String> sortedList2 = sampleString.stream().sorted(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder())).toList();
        System.out.println(sortedList2);

       // List<String> sortedList3 = sampleString.stream().sorted(Comparator::comparingInt(String::length)) //why this is not working
        //System.out.println(sortedList3);
    }

    private static void sortStringComparatorThenComparing() {
        List<String> sampleString = Arrays.asList("this is a string that i have written".split(" "));
        Collections.sort(sampleString);
        sampleString.sort(Comparator.comparingInt(value -> value.length()));
        System.out.println(sampleString);
        sampleString.sort(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));
        System.out.println(sampleString);
    }

    private static void sortStringComparator() {
        List<String> sampleString = Arrays.asList("this is a string".split(" "));
        Collections.sort(sampleString);
        System.out.println(sampleString);
        sampleString.sort((a, b) -> a.length() - b.length());
        System.out.println(sampleString);
    }


}
