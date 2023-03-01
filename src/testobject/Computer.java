package testobject;

public class Computer {
    private String name;
    private int ram;
    private int hdd;
    private double weight;

    public Computer(String name, int ram, int hdd, int weight){
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.weight = weight;
    }

    public void on() {
        print("я включился " + name);
    }
    public void off() {
        print("я выключился");
    }
    public void load() {
        print("я загружаюсь, мой объем жесткого диска равен " + hdd + " Гб");
    }
    private void print(String str){
        System.out.println(str);
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int newRam) {
        if (newRam > 0) {
            ram = newRam;
        } else {
            System.out.println("Переданное значение " + newRam + " не может быть отрицательным");
        }

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double newWeight) {
        weight = newWeight;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int newHdd) {
        if (newHdd > 0) {
            hdd = newHdd;
        } else {
            System.out.println("Переданное значение " + newHdd + " не может быть отрицательным");
        }
    }
}
