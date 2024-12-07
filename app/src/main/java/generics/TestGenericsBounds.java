package generics;

import subclassfordemo.Animal;
import subclassfordemo.Dog;

import java.util.ArrayList;
import java.util.List;

public class TestGenericsBounds {
    static GenericsBounds genericsBounds = new GenericsBounds();

    public static void main(String[] args) {
        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog("Tommy", 4));
        genericsBounds.process(dogList);

        genericsBounds.consume(dogList);
        Animal animal = new Animal("movie", 4);
        List<Animal> animalList = new ArrayList<>();
        animalList.add(animal);
        genericsBounds.consume(animalList);
    }

}
