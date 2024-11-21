class myRunnable implements Runnable {
    Thread t;

    myRunnable() {
        System.out.println("Thread Is Created");
        t = new Thread(this); 
        t.start();
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

public class Second {
    public static void main(String[] args) {
        new myRunnable();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.toString());
        }
    }
}
