package datastructure;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by rinko on 8/6/2016.
 */
public class UseListMap {
    public static void main(String[] args) {

        //

        List<String> CityOfBD = new ArrayList<String>();
        CityOfBD.add("Dhaka");
        CityOfBD.add("Gazipur");
        CityOfBD.add("Munshigonj");
        CityOfBD.add("Rajshahi");


        List<String> CityOfUSA = new ArrayList<String>();
        CityOfUSA.add("NY");
        CityOfUSA.add("CA");
        CityOfUSA.add("NJ");
        CityOfUSA.add("IL");

        Map<String, List<String>> map = new LinkedHashMap<String, List<String>>();
        map.put("Bangladesh",CityOfBD);
        map.put("India",CityOfUSA);

        //map.put("Japan","Toke2yo");

        for(Map.Entry<String, List<String>> entry:map.entrySet())
        {
            System.out.println(entry.getKey()+" : "+ entry.getValue());
        }


    }
}

