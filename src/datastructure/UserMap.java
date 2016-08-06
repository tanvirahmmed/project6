package datastructure;

import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by rinko on 8/6/2016.
 */
public class UserMap {


    public static void main(String[] args) {

        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("Bangladesh","Dhaka");
        map.put("India","Kolkata");
        map.put("UK","Londo");
        map.put("Canada","Ontario");
        map.put("Japan","Tokeyo");
        //map.put("Japan","Toke2yo");

        for(Map.Entry<String, String> entry:map.entrySet())
        {
            System.out.println(entry.getKey()+" : "+ entry.getValue());
        }

    }
}



