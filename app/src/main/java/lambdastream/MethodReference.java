package lambdastream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MethodReference {
    public static void main(String[] args) {

        Stream.of(1,2,3,3).forEach(System.out::print);
        Play play = new Play();
        Play play2 = new Play();

        Stream.of(1,2,3,4).forEach(play::playBadminton);
    }

    static class Play{
        public void playBadminton(int a){
            System.out.println("Lets play Badminton " + a);
        }
    }
}
