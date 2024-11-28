import java.util.*;

public class CompareClass {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(2, "Murad"));
        users.add(new User(1, "Nihat"));
        users.add(new User(1, "Anar"));
        //users.add(new User(null, null));

        Comparator<User> comparator = Comparator.nullsFirst(Comparator.comparing(User::getId));
        //comparator.thenComparing(User::getName);
        users.sort(comparator);
        System.out.println(users);
        System.out.println(comparator.compare(users.get(1), users.get(0)));
    }
}
