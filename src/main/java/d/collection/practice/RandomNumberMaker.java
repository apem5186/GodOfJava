package d.collection.practice;

import java.util.HashSet;
import java.util.Random;

public class RandomNumberMaker {
    public static void main(String[] args) {
        RandomNumberMaker sample = new RandomNumberMaker();
        for (int i = 0; i <= 10; i++) {
            System.out.println(sample.getSixNumber());
        }
    }

    public HashSet<Integer> getSixNumber() {
        Random random = new Random();
        HashSet<Integer> hs = new HashSet<>();

        while (hs.size() < 6) {
            int tempNumber = random.nextInt(45);
            hs.add(tempNumber);
        }
        return hs;
    }
}
