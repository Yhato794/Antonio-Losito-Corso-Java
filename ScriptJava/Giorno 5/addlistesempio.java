import java.util.ArrayList;

public class addlistesempio {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Fiat");
        cars.add("Mazda");
        cars.set(0, "Opel");
        System.out.println(cars +" "+cars.size());
        System.out.println(cars.get(0));


    }

}
