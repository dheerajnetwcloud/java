package innerclasses;

import java.util.Arrays;
import java.util.Comparator;

public class OuterClass {

    private final String name;

    public OuterClass(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public class InnerClass{
        public void printName(){
            System.out.println(name);
        }
    }

    public static class StaticInnerClass{
        public void printName(){
            System.out.println("Static Inner class");
        }

        public static void suggestName(){
            System.out.println("name" + " Ansh");
        }
    }

    public void sort(Integer[] a){

        //Inner clas without creating a class that extends the Comparator class
        Arrays.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        //Same as above, but using lambda
        Arrays.sort(a, (o1, o2) -> o2 - o1);
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass("Hello");
        InnerClass innerClass = outerClass.new InnerClass();
        innerClass.printName();

        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();
        staticInnerClass.printName();

        OuterClass.StaticInnerClass.suggestName();



    }
}
