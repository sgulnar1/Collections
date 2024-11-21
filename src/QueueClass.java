import java.util.*;

public class QueueClass {
    public static void main(String[] args) {
        ArrayDeque<User> users1 = new ArrayDeque<>();
        users1.add(new User(6, "Aygul"));
        users1.add(new User(5, "Gulnar"));
        users1.add(null);
        System.out.println(users1.poll());
        System.out.println(users1.poll());
        System.out.println(users1);
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("A");
        priorityQueue.add("C");
        priorityQueue.add("B");
        priorityQueue.add("D");
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
        PriorityQueue<User> users = new PriorityQueue<>();
        users.add(null);
        User user2 = new User(2, "Gulnar");
        User user1 =new User(1, "Gulnar");
//        System.out.println("1: " + user2.compareTo(user1));
//        System.out.println(user1.compareTo(user2));
        users.add(user2);
        users.add(user1);

        System.out.println(users);
        System.out.println(users.peek());
        System.out.println("users: " + users.comparator());
        PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>(Comparator.reverseOrder());
        priorityQueue2.add(1);
        priorityQueue2.add(3);
        priorityQueue2.add(2);
        priorityQueue2.poll();
        priorityQueue2.poll();
        System.out.println(priorityQueue2);

        System.out.println("priorityQueue2: " + priorityQueue2.comparator());

    }
}
