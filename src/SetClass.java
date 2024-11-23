import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetClass {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(null);
        set.add(1);
        set.add(2);
        set.add(1);

        System.out.println(set);

        HashSet<User> users = new HashSet<>();
        LinkedHashSet<User> users1 = new LinkedHashSet<>();
        TreeSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(17);
        for (int i = 0; i <= 10; i++)
            sortedSet.add(i);
        //sortedSet.remove(5);
        System.out.println(sortedSet.higher(5)); //lower < floor<= //ceiling>= higner>
        System.out.println(sortedSet.tailSet(5));
        System.out.println("subset: " + sortedSet.subSet(17,true, 27, false));
        System.out.println(sortedSet);
        User user1 = new User(1, "Gulnar");
        User user2 = new User(1, "Gulnar");
        User user3 = new User(2, "Gulnar");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users1.add(user1);
        users1.add(user2);
        users1.add(user3);
        System.out.println(users);
        System.out.println(users1);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(52132 & (16 - 1));
        System.out.println(5666 & (16 - 1));
//
//        User user1 = new User(1,"Gulnar");
//        User user2 = user1;
//        User user3 = user2;
//        System.out.println("user1.equals(user1) " + user1.equals(user1)); //reflexive
//        System.out.println("user1.equals(user2) " + user1.equals(user2) );
//        System.out.println("user2.equals(user3) " + user2.equals(user3) );
//        System.out.println("user1.equals(user3) " + user1.equals(user3) ); //transitive
//        System.out.println("user2.equals(user3) " + user2.equals(user3) );
//        System.out.println("user3.equals(user2) " + user3.equals(user2) ); //symmetric
//        System.out.println(user1.equals(null));
    }
}
