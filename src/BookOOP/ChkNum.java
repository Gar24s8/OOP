package BookOOP;

public class ChkNum {
    // Возврат логического значения true
    // если x содержит четное число
    boolean isEven(int x) { // здесь х - целочисленный параметр метода isEven. Метод isEven возвращает логическое значение.
        if ((x % 2) == 0) return true;
        else return false;
    }
}

    class ParmDemo {
        public static void main(String[] args) {
            ChkNum e = new ChkNum();
            if (e.isEven(10)) System.out.println("10 - четное число"); // передача аргумента методу isEven
            if (e.isEven(9)) System.out.println("9 - четное число");
            if (e.isEven(8)) System.out.println("8 - четное число");
        }
    }
