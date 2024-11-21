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
                System.out.println("Good Morning");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e.toString());
        }
    }
}

public class GoodMorning {
    public static void main(String[] args) {
        new myRunnable();

        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Good AfterNoon");
                Thread.sleep(500);
            }
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e.toString());
        }
    }
}
