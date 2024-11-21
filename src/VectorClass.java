import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        Vector<Integer> list = new Vector<>();
        list.add(1);
        list.add(2);
        Integer[]integers = new Integer[list.size()];
        list.copyInto(integers);
        System.out.println(Arrays.toString(integers));
        list.insertElementAt(7,1);
        System.out.println(list);
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println(stack);
        System.out.println("B: " +stack.search("B"));
        System.out.println(stack.search("A"));
        System.out.println(stack.peek()); //C
        System.out.println(stack.pop()); //C
        System.out.println(stack.peek()); //B
        System.out.println(stack.pop()); //B
        System.out.println(stack.peek()); //A

    }
}
