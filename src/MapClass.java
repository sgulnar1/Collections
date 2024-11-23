import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapClass {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        Set<User> users = new HashSet<>();
        users.add(new User (1, "Gulnar"));
        hm.put(1, "Gulnar");
        System.out.println(hm);
        System.out.println(users);
        System.out.println(hm.getOrDefault(1, "*****"));
        hm.put(8522, "Leyla");
        System.out.println(hm);
        System.out.println(hm.keySet());
        System.out.println(hm.entrySet());

    }
    public void add(int a) {

    }
    public void add(int a, int b) {

    }
}
