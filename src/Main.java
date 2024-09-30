import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       // exampleString();
       // exampleCar();
        exampleInt();
    }

    private static void exampleString() {
        String[] massiv = {"Инна", "Ольга", "Борис", "Михаил"};
        System.out.println("Arrays.toString(massiv) = " + Arrays.toString(massiv));
        //Туда:    массив --> список
        List<String> list = Arrays.asList(massiv);
        System.out.println("list = " + list);
       // list.add( "Кирилл");    //Ошибка: там список фиксированного размера
        List<String> list2 = new ArrayList<>(list);
        list2.add(0,"Мефодий");
        System.out.println("list2 = " + list2);
        //Обратно:   список --> массив
        String[] massiv2 = list2.toArray(new String[0]);
        System.out.println("Arrays.toString(massiv2) = " + Arrays.toString(massiv2));
    }

    private static void exampleCar() {
        Car[] massiv = {new Car("Фокус", 2), new Car("Хаваль", 3.5), new Car("Вей", 3.3)};
        System.out.println("Arrays.toString(massiv) = " + Arrays.toString(massiv));
        //Туда:    массив --> список
        List<Car> list2 = new ArrayList<>(Arrays.asList(massiv));
        System.out.println("list2 = " + list2);
        list2.add(0,new Car("БМВ", 4));
        System.out.println("list2 = " + list2);
        //Обратно:   список --> массив
        Car[] massiv2 = list2.toArray(new Car[0]);
        System.out.println("Arrays.toString(massiv2) = " + Arrays.toString(massiv2));
    }

    private static void exampleInt() {
        int[] massiv = {5, 19, 27, 16, 34, -34, 33};
        System.out.println("Arrays.toString(massiv) = " + Arrays.toString(massiv));
        //Туда:    массив --> список
       // List<int> list = new ArrayList<>(); НИКАК
        List<Integer> list2 = new ArrayList<>(massiv.length);
        for (int i = 0; i < massiv.length; i++) {
            list2.add(massiv[i]);
        }
        System.out.println("list2 = " + list2);
        //list2.add(0,new Integer(-999));  //устаревший вариант
        list2.add(0, -999);
        System.out.println("list2 = " + list2);
//        //Обратно:   список --> массив
//        Car[] massiv2 = list2.toArray(new Car[0]);
//        System.out.println("Arrays.toString(massiv2) = " + Arrays.toString(massiv2));
    }
}

class Car {
    String model;
    double length;

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", length=" + length +
                '}';
    }

    public Car(String model, double length) {
        this.model = model;
        this.length = length;
    }
}