import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsClass {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();

        list1.add(4);
        list1.add(4);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1);
        List<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(7);
        list2.add(9);
        Collections.copy(list1, list2);
        System.out.println(list2);
        System.out.println(list1);
        System.out.println(Collections.binarySearch(list1, 3));
        List list3 = new ArrayList();
        Collection collection = Collections.checkedCollection(list3, Integer.class);
        collection.add(755);
        collection.add(55);
        System.out.println(list3);
        System.out.println(Collections.disjoint(list1, list2));
        System.out.println(Collections.disjoint(list1, list3));
        List<Object> objects = Collections.emptyList();
        Collections.fill(list3, 700);
        list1.add(5);
        list1.add(7);
        list1.add(9);
        System.out.println(list3);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(Collections.frequency(list1, 5));
        System.out.println(Collections.indexOfSubList(list1, list2));
        System.out.println(Collections.lastIndexOfSubList(list1, list2));
        Collections.list()
    }

}
