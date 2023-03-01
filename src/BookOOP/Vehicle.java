package BookOOP;

/* Добавление параметризированного метода fuelneeded(), в котором выполняется расчет объема топлива,
необходимого транспортнуму средству для преодоления заданного расстояния.
 */
public class Vehicle {
    int passengers; //количество пассажиров
    int fuelcap; //емкость топливного бака
    int mpg; // средний расход топлива

    int range() {
        return mpg * fuelcap; // возврат дальности поездки для заданного транспортного средства
    }

    // Расчет количества топлива,
    //необходимого транспортнуму средству для преодоления заданного расстояния.
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}

// в этом классе объявляется объект типа Vehicle
class CompFuel {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportcar = new Vehicle();
        double gallons;
        int dist = 252;

        // присваиваем значение полям в объекте minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // присваиваем значение полям в объекте sportcar
        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;

        gallons = minivan.fuelneeded(dist);
        System.out.println("Для преодоления " + dist + " миль фургону потребуется " + gallons + " галлонов топлива");

        gallons = sportcar.fuelneeded(dist);
        System.out.println("Для преодоления " + dist + " миль спорткару потребуется " + gallons + " галлонов топлива");
    }
}
