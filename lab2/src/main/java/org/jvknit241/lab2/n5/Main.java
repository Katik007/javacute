package org.jvknit241.lab2.n5;
import org.jvknit241.lab2.n5.Restaraunt;

public class Main {
    public static void main(String[] args) {
        Restaraunt restaraunt = new Restaraunt();
        Thread threadCooker = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                restaraunt.cook("Блюдо " + i);
            }
        });

        Thread threadWaiter = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                restaraunt.serve();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        threadCooker.start();
        threadWaiter.start();
    }
}
