import java.util.*;

public class MapClass {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        Set<User> users = new HashSet<>();
        users.add(new User (1, "Gulnar"));
        hm.put(1, "Gulnar");
        hm.put(null, "Gulnar");
        //hm.put(1, null);
        //hm.compute(1, (key, value) -> value="testt");
        //hm.computeIfAbsent(2, (value) -> "dsbdfhbgtf");
        hm.computeIfPresent(1, (key, value) -> "dsbdfhbgtf");
        hm.put(8522, "Leyla");
        hm.merge(8522, " test", (valueOld, valueNew) -> valueOld + valueNew);
        System.out.println("HM: " + hm);
        System.out.println(users);
        System.out.println(hm.getOrDefault(1, "*****"));

        System.out.println(hm);
        System.out.println(hm.keySet());
        System.out.println(hm.entrySet());
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(8522, null);
//        treeMap.put(null, null);
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        //hashtable.put(8522, null);
        //hashtable.put(null, "dvgdf");
    }
    public void add(int a) {

    }
    public void add(int a, int b) {

    }
}
