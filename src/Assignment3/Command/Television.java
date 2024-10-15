package Assignment3.Command;

// Класс телевизора с методами управления
public class Television {
    public void turnOn() {
        System.out.println("Television is ON");
    }

    public void turnOff() {
        System.out.println("Television is OFF");
    }

    public void volumeUp() {
        System.out.println("Volume increased");
    }

    public void volumeDown() {
        System.out.println("Volume decreased");
    }

    public void nextChannel() {
        System.out.println("Switched to next channel");
    }

    public void previousChannel() {
        System.out.println("Switched to previous channel");
    }
}
