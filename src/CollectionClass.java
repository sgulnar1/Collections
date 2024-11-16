import java.util.*;

public class CollectionClass {
    public static void main(String[] args) {
        String[] strings = new String[5];
        System.out.println(Arrays.toString(strings));
        int[] ints = new int[5];
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        List<String> list1 = new ArrayList<>();
        list1.add("D");
        list1.add("E");
        list.addAll(list1);
        System.out.println(list);
        System.out.println(list);
        System.out.println("for each");
        for (String s : list)
            System.out.println(s);
        System.out.println("for");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("B: " + list.get(1));
        list.remove(1);
        System.out.println("c: " + list.get(1));
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next()); // a //c
        }
        System.out.println("while 2");
        while (iterator.hasNext()) {
            System.out.println(iterator.next()); // a //c
        }

        System.out.println("list iterator");
        System.out.println("while 1");

        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.nextIndex());
            System.out.println(listIterator.next()); // a //c
        }
        System.out.println("while 2");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previousIndex());
            System.out.println(listIterator.previous()); // a //c
        }
        listIterator.add("sdsf");
        System.out.println("while 3");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.nextIndex());
            System.out.println(listIterator.next()); // a //c
        }
        System.out.println("while 4");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previousIndex());
            System.out.println(listIterator.previous()); // a //c
        }
        listIterator.forEachRemaining(t -> {
                    System.out.println("  ");
                    System.out.println("element: " + t);
                }
        );
    }
}
