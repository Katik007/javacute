package org.jvknit241.lab2.n8;

public class TrafficLight {
    private boolean isRed = true;

    public synchronized boolean isRed() {
        return isRed;
    }

    public synchronized void waitForGreen() {
        while (isRed) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized void changeColor() {
        isRed = !isRed;
        System.out.println((isRed ? "Красный" : "Зеленый") + " цвет включен.");
        notifyAll();
    }
}
