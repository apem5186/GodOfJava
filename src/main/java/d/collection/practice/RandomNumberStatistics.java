package d.collection.practice;

import java.util.Hashtable;
import java.util.Random;
import java.util.Set;

public class RandomNumberStatistics {

    private final int DATA_BOUNDARY = 50;
    Hashtable<Integer, Integer> hashtable = new Hashtable<>();

    public static void main(String[] args) {
        RandomNumberStatistics sample = new RandomNumberStatistics();
        sample.getRandomNumberStatistic();
    }

    public void getRandomNumberStatistic() {
        Random random = new Random();
        for (int i=0; i < 5000; i++) {
            putCurrentNumber(random.nextInt(DATA_BOUNDARY) + 1);
        }
        printStatistic();
    }

    public void putCurrentNumber(int tempNumber) {
        if (!hashtable.containsKey(tempNumber)) {
            hashtable.put(tempNumber, 1);
        } else
            hashtable.put(tempNumber, hashtable.get(tempNumber) + 1);
    }

    public void printStatistic() {
        Set<Integer> keySet = hashtable.keySet();
        for (Integer tempKey:keySet) {
            System.out.print(tempKey+"="+hashtable.get(tempKey) + "\t");
            if (tempKey%10-1 == 0) System.out.println();
        }
    }
}
