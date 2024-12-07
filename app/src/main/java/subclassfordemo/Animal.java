package subclassfordemo;

public class Animal implements Mammal{
    String name;
    int legs;
    public Animal(String name, int legs){
        this.name = name;
        this.legs = legs;
    }

    @Override
    public Boolean  canBark() {
        return false;
    }
}
