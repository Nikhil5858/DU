class myThread implements Runnable {
    Thread t;

    myThread() {
        System.out.println("Thread is Created!");
        t = new Thread(this);
        t.start();
    }

    public void run() {
        try {
            for (int i = 0; i <= 20; i++) {
                if (i % 2 == 0) {
                    System.out.println("Child Thread " + i);
                    Thread.sleep(500);
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e.toString());
        }
    }
}

public class FindEven {
    public static void main(String[] args) {
        new myThread();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.toString());
        }
    }
}
