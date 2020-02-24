package java_interface.Example;

public class Cat implements Animal {
    @Override
    public void move() {
        System.out.println("Run very fast!");
    }

    @Override
    public void eat() {
        System.out.println("Not eat too much!");
    }

    @Override
    public void sleep() {
        System.out.println("Dont sleep too much!");
    }
}
