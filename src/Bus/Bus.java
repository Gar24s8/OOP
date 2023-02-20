package Bus;

public class Bus {
    public String name;
    public int engine;
    public int transmission;
    public int wheel;
    public String stop;

    public void start() {
        System.out.println(name + " Engine start V" + engine);
    }

    public void move() {
        System.out.println("Передача включена: " + transmission);
    }

    public void ride() {
        System.out.println(wheel + " Wheels drive");
    }

    public void stop() {
        System.out.println("Stopped");
    }
}
