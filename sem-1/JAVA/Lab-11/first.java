class myThread extends Thread {
    myThread() {
        System.out.println("Thread Is Created");
        start();
    }

    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Child Thread " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e.toString());
        }
    }
}

public class first {
    public static void main(String[] args) {
        new myThread();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.toString());
        }
    }
}
