import testobject.Computer;

public class MyProgram {
    public static void main(String[] args) {
        Computer comp = new Computer("IBM", 2048, 350, 2);

//        comp.setName("IBM");
//        comp.setRam(2048);
//        comp.setHdd(350);
        comp.on();
        comp.load();
        comp.off();

    }
}

