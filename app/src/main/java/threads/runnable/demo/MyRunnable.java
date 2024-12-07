package threads.runnable.demo;

public class MyRunnable implements Runnable{

    Thread thread = new Thread(this);

    private final int id;

    public MyRunnable(int id){
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println(id);
    }

    public void start(){
        thread.start();
    }
}
