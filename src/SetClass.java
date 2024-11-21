import java.util.HashSet;

public class SetClass {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(null);
        set.add(1);
        set.add(2);
        set.add(1);

        System.out.println(set);

        HashSet<User> users = new HashSet<>();

        users.add(new User(1,"Gulnar"));
        users.add(new User(1,"Gulnar"));
        users.add(new User(2,"Gulnar"));
        System.out.println(users);

        User user1 = new User(1,"Gulnar");
        User user2 = user1;
        User user3 = user2;
        System.out.println("user1.equals(user1) " + user1.equals(user1)); //reflexive
        System.out.println("user1.equals(user2) " + user1.equals(user2) );
        System.out.println("user2.equals(user3) " + user2.equals(user3) );
        System.out.println("user1.equals(user3) " + user1.equals(user3) ); //transitive
        System.out.println("user2.equals(user3) " + user2.equals(user3) );
        System.out.println("user3.equals(user2) " + user3.equals(user2) ); //symmetric
        System.out.println(user1.equals(null));
    }
}
