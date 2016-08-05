package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by rrt on 7/31/2016.
 */
public class UseIterator {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("NY");
        list.add("FL");
        list.add("AZ");

        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
