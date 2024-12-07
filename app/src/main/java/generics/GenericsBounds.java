package generics;

import subclassfordemo.Animal;
import subclassfordemo.Cat;
import subclassfordemo.Dog;
import subclassfordemo.Mammal;

import java.util.List;

public class GenericsBounds{

    public void process(List<? extends Mammal> list){
        Dog dog = new Dog("test", 4);
        //list.add(dog) This will not work here
        list.forEach(a -> System.out.println(a.canBark()));
    }
    public void consume(List<? super Dog> list){
        Dog dog = new Dog("test", 4);
        Cat cat = new Cat("test", 4);
        Animal animal = new Animal("movie", 4);
        list.add(dog); //This will work here
       // list.add(animal);
        //list.add(cat); This will work here
        //list.forEach(a -> System.out.println(a.canBark())); This will not work here

    }
}
