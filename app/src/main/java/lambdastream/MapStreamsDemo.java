package lambdastream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapStreamsDemo {
    public static void main(String[] args) {
        createObjectFromStringList();
        createArrayFromStringList();
        createObjetFromStringListUsingMethodReference();
    }

    private static void createObjetFromStringListUsingMethodReference() {
        List<String> list = Arrays.asList("Henry", "Robert", "Tim");
        List<Person> personList = list.stream().map(Person::new).toList();
        System.out.println(personList);
    }

    private static void createArrayFromStringList() {
        List<String> list = Arrays.asList("Henry", "Robert", "Tim");
        Person[] personList = list.stream().map(Person::new).toArray(Person[]::new);
        System.out.println(Arrays.toString(personList));
    }

    private static void createObjectFromStringList() {
        List<String> list = Arrays.asList("Henry", "Robert", "Tim");
        List<Person> personList = list.stream().map(v -> new Person(v)).toList();
        System.out.println(personList);
    }

    static class Person{
        String name;
        Person(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
