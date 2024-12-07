package threads.runnable.demo;

import java.util.List;
import java.util.stream.Stream;

public class UseMyRunnable {
    public static void main(String[] args) {
       List<MyRunnable> list =  Stream.iterate(0, n -> n + 1).map(MyRunnable::new).limit(10).toList();
      list.forEach(MyRunnable::start);

    }
}
