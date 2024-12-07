package generics;

public class Tupple<T,U> {

    T t;
    U u;

    Tupple(T t, U u){
        this.t  = t;
        this.u = u;
    }

    public <X, Y> void print(X t, Y u){
        System.out.println(t + " " + u);
    }

    public void printInstance(){
        System.out.println(t + " " + u);
    }
}
