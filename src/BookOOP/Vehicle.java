package BookOOP;

public class Vehicle {
    int passengers; //количество пассажиров
    int fuelcap; //емкость топливного бака
    int mpg; // средний расход топлива

    int range() {
        return mpg * fuelcap; // возврат дальности поездки для заданного транспортного средства
    }
}

// в этом классе объявляется объект типа Vehicle
class ReturnMeth {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportcar = new Vehicle();
        int range1, range2;

        // присваиваем значение полям в объекте minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // присваиваем значение полям в объекте sportcar
        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;

        range1 = minivan.range(); // Присваивание переменной значения, возвращаемого методом
        range2 = sportcar.range();

        // Расчет дальности поездки с полным баком горючего
        System.out.println("Минифургон может привезти " + minivan.passengers + " пассажиров на расстояние " + range1 + " миль.");
        System.out.println("Спортивный автомобиль может привезти " + sportcar.passengers + " пассажиров на расстояние " + range2 + " миль.");
    }
}
