class A extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("hi");
            // even if u set priority it might still print hii frist then hello so instead ask hii to wait.
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("Hello");
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class V25_Threads {
    public static void main(String args[]) {

        A a = new A();
        B b = new B();
        b.setPriority(Thread.MAX_PRIORITY);
        a.start();
        b.start();
        // Want to set priority from 1 to 10
    }
}

// machine gets time so it prints all the hii first so rather increase the
// number of values.

/*
hi
hi
hi
Hello
Hello
Hello
hi
hi
hi
Hello
Hello
Hello
hi
hi
hi
*/