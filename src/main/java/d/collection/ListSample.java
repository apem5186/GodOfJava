package d.collection;

import java.util.ArrayList;

public class ListSample {
    public static void main(String[] args) {
        ListSample sample = new ListSample();
        sample.checkArrayList7();
    }

    public void checkArrayList1() {
        ArrayList list1 = new ArrayList();
    }

    public void checkArrayList2() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add(1, "A1");
        for (String tempData:list) {
            System.out.println(tempData);
        }
    }
    public void checkArrayList3() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add(1, "A1");
        ArrayList<String> list2 = new ArrayList<>(list);
        list2 = list;
        list.add("P");
        for (String tempData:list2) {
            System.out.println("List2 " +tempData);
        }
    }

    public void checkArrayList7() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        String[] strList = list.toArray(new String[0]);
        for (String temp:strList) {
            System.out.println(temp);
        }
    }
}
