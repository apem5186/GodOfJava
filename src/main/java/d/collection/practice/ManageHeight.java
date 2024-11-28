package d.collection.practice;

import java.util.ArrayList;

public class ManageHeight {
    public static void main(String[] args) {
        ManageHeight sample = new ManageHeight();
        sample.setData();
        for (int i=1; i <=5; i++) {
            sample.printAverage(i);
        }
    }
    ArrayList<ArrayList<Integer>> gradeHeights = new ArrayList<>();

    public void setData() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(170);
        list1.add(180);
        list1.add(173);
        list1.add(175);
        list1.add(177);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(160);
        list2.add(165);
        list2.add(167);
        list2.add(186);
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(158);
        list3.add(177);
        list3.add(187);
        list3.add(176);
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(173);
        list4.add(182);
        list4.add(181);
        ArrayList<Integer> list5 = new ArrayList<>();
        list5.add(170);
        list5.add(180);
        list5.add(165);
        list5.add(177);
        list5.add(172);
        gradeHeights.add(list1);
        gradeHeights.add(list2);
        gradeHeights.add(list3);
        gradeHeights.add(list4);
        gradeHeights.add(list5);
    }

    public void printHeight(int classNo) {
        ArrayList<Integer> he = new ArrayList<>(gradeHeights.get(classNo-1));
        he.sort(Integer::compareTo);
        System.out.println("Class No.:"+classNo);
        for (Integer temp:he) {
            System.out.println(temp);
        }
    }

    public void printAverage(int classNo) {
        ArrayList<Integer> he = new ArrayList<>(gradeHeights.get(classNo-1));
        Double result = 0.0;
        for (Integer temp:he)
            result += (float) temp;
        result = result / he.size();
        System.out.println("Class No.:"+classNo);
        System.out.println("Height average:"+result);
    }
}
