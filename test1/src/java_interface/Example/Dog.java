package java_interface.Example;

public class Dog implements Animal {
    @Override
    public void move() {
        System.out.println("Move Fast!");
    }

    @Override
    public void eat() {
        System.out.println("Too much!");
    }

    @Override
    public void sleep() {
        System.out.println("Never Sleep!");
    }
}
