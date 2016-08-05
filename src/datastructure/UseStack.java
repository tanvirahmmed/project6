package datastructure;

import java.util.Stack;

/**
 * Created by rrt on 7/31/2016.
 */
public class UseStack {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("Kaya's Plate");
        stack.push("Tanveer's plate");
        stack.push("Shakir's plate");

        System.out.println("Kaya is crying for her plate");
        System.out.println(stack.pop());
        stack.push("Iqbal's plate");
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
