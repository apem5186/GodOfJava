package d.collection;

import java.util.HashSet;
import java.util.List;

public class SetSample {
    public static void main(String[] args) {
        SetSample sample = new SetSample();
        String[] cars = new String[]{
                "Tico", "Sonata", "BMW", "Benz",
                "Lexus", "Mustang", "Grandeure",
                "The Beetle", "Mini Cooper", "i30",
                "BMW", "Lexus", "Carnibal", "SM5",
                "SM7", "SM3", "Tico"
        };
        System.out.println(sample.getCarKinds(cars));
    }

    public int getCarKinds(String[] cars) {
        HashSet carKinds = new HashSet(List.of(cars));
        return carKinds.size();
    }
}
