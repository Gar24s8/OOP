package Bus;

public class Programbus {
    public static void main(String[] args) {
        Bus bus=new Bus();
        bus.name = "PAZ";
        bus.engine = 8;
        bus.transmission = 1;
        bus.wheel = 6;
        bus.stop = "stop";

        bus.start();
        bus.move();
        bus.ride();
        bus.stop();
    }
}
