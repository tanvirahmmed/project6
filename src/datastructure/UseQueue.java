package datastructure;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by rrt on 7/31/2016.
 */
class UseQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.add("Kaya's Plate");
        queue.add("Tanveer's plate");
        queue.add("Shakir's plate");

        System.out.println(queue.element());

    }
}
