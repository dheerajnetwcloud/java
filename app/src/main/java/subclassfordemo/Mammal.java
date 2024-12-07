package subclassfordemo;

public interface Mammal {
    Boolean canBark();

    default boolean canYouSwim(){
        return false;
    }

    default void printMyName(String name){
        System.out.println("Your name is :: " + name);
    }

}
