package testobject;

public class Computer {
    public String name;
    public int ram;
    public int hdd;
    public double weight;

    public void on() {
        System.out.println("я включился "+name);
    }

    public void off() {
        System.out.println("я выключился");
    }

    public void load() {
        System.out.println("я загружаюсь, мой объем жесткого диска равен "+hdd+" Гб");
    }
}
