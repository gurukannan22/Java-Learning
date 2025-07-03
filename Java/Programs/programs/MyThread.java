package programs;

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " - " + Thread.currentThread().getName());
            try {
                Thread.sleep(5000);  // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t1.join();  // Waits for t1 to finish before starting t2
        t2.start();
    }
}