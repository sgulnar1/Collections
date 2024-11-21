import java.util.*;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        ArrayList<String> list1 = new ArrayList<>();
        list.add(null);
        list.add("Islam");
        list.offerLast("Fidan");
        list.add("Gulnar");
        System.out.println(list);
        //offer peak poll
        list.offerLast("Fidan");
        list.offer("Kazim");
        list.offerLast("Fidan");
        list.offerFirst("Nihat");
        list.offerLast("Fidan");
        list.offerLast("Fidan");
        System.out.println(list.get(5));
        // list.clear();
        System.out.println(list);
        System.out.println(list.peek());
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());
        System.out.println(list);
        System.out.println(list.poll());
        System.out.println(list.pollFirst());
        System.out.println(list.pollLast());
        System.out.println(list);
        System.out.println(list.pop());
        list.push("Serxan");
        System.out.println(list.remove());
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Fidan");
        list.removeAll(list2);
        list.removeIf(element -> element.length() == 5);

        list.push(null);
        System.out.println(list.get(0).substring(0));
        System.out.println(list);
    }
}
