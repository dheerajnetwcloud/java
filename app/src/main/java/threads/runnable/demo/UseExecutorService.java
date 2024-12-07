package threads.runnable.demo;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

public class UseExecutorService {
    public static void main(String[] args) {
        List<MyRunnable> list =  Stream.iterate(0, n -> n + 1).map(MyRunnable::new).limit(15).toList();
        ExecutorService service = Executors.newFixedThreadPool(10);
        list.forEach(service::execute);
        service.shutdown();
    }
}
