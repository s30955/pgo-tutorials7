import java.util.ArrayList;
import java.util.Collections;

public class Main1 {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota Camry", 2018));
        cars.add(new Car("Honda Accord", 2016));
        cars.add(new Car("Ford Mustang", 2020));
        cars.add(new Car("Chevrolet Malibu", 2017));
        cars.add(new Car("BMW 3 Series", 2019));
        cars.add(new Car("Audi A4", 2015));
        cars.add(new Car("Mercedes-Benz C-Class", 2021));
        cars.add(new Car("Volkswagen Passat", 2014));
        cars.add(new Car("Mazda 6", 2013));
        cars.add(new Car("Subaru Outback", 2022));

        Collections.sort(cars);
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}

