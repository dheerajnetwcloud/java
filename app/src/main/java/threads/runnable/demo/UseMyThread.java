package threads.runnable.demo;

import java.util.List;
import java.util.stream.Stream;

public class UseMyThread {
    public static void main(String[] args) {
       List<MyThread> list =  Stream.iterate(0, n->n+1).map(MyThread::new).limit(10).toList();
       list.forEach(MyThread::start);
    }
}
