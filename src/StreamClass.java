import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> integers = List.of(1, 3, 2, 4, 5, 4);
        // System.out.println(integers);
//        integers.add(7);
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(4);
        Stream<Integer> stream = list.stream();
        stream.onClose(() ->
                System.out.println("Close olundu"));
        //list.add(null);
//        List<Integer> list2 = new ArrayList<Integer>();
//        for (Integer i : list) {
//            if (i % 2 == 0)
//                list2.add(i);
//        }
//        System.out.println(list2);
//        Set<Integer> list1 = list.stream()
//                .filter((element) -> element % 2 == 0)
//                .collect(Collectors.toSet());
//        System.out.println(list1);
//        List<Integer> emptyList = new ArrayList<>();
//        System.out.println(list.stream().allMatch(element -> element % 2 == 0));
//        System.out.println(emptyList.stream().allMatch(element -> element % 2 == 0));
//        System.out.println(list.stream().anyMatch(element -> element % 2 == 0));
//        System.out.println(emptyList.stream().anyMatch(element -> element % 2 == 0));
//        System.out.println(emptyList.stream().count());
//        System.out.println(list);
//        List<Integer> list3 = list.stream().dropWhile(element -> element % 2 == 0).toList();
//        System.out.println(list.stream().distinct().toList());
//        List<Integer> list4 = list.stream().dropWhile(element -> element % 2 != 0).toList();
//        System.out.println(list4);
//        Optional<Integer> any = list.stream().findAny();
//        if (any.isPresent()) {
//            System.out.println("any");
//            Integer i = any.get();
//            System.out.println(i);
//        }
//        Optional<Integer> emp = emptyList.stream().findAny();
//        System.out.println(any);
//        if (emp.isPresent()) {
//            System.out.println("emp");
//        }
//        System.out.println(emp);
//
//        List<Integer> list5 = list.stream().flatMap((element) -> Stream.of(element * 5)).toList();
//        list.stream().forEachOrdered(element -> System.out.println("element " + element));
//        System.out.println(list5);
//        System.out.println(list.stream().limit(3).toList());
//        System.out.println(list.stream().map(element -> element * 5).toList());
//        System.out.println(list);
//        System.out.println(list.stream().mapMulti((element, result) -> {
//            result.accept(element * 1);
//            result.accept(element * 5);
//            result.accept(element -7);
//        }).toList());
//        System.out.println(list.stream().max(Comparator.nullsFirst(Comparator.naturalOrder())).isPresent() ?list.stream().max(Comparator.naturalOrder()).get(): null);
//        System.out.println(list.stream().min(Comparator.naturalOrder()).get());
        System.out.println(list);
        System.out.println(list.stream().noneMatch(i -> i > 10));

//        stream.peek(element -> System.out.println ("element peek: " + element )).forEach(System.out::println);
//        System.out.println("foreanch 2");
//        stream.forEach(System.out::println);
        System.out.println(list.stream().reduce(0, (result, element) -> result));
        System.out.println(list.stream().skip(2).toList());
        System.out.println(list.stream().sorted().toList());
        List<User> users = new ArrayList<>();
        users.add(new User(2, "Murad"));
        users.add(new User(1, "Nihat"));
        System.out.println(users.stream()
                .sorted(Comparator.comparing(User::getId)));
        System.out.println(list.stream().takeWhile(i -> i <= 4).toList());
        Object[] arr = list.stream().toArray();
        System.out.println(arr);
        stream.unordered();
        System.out.println(stream.isParallel());
        stream.sequential();
        System.out.println(stream.isParallel());

    }
}
