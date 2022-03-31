package HashMaps;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasics {
    public static void main(String[] args) {
        HashMap<Integer,String>  zipMap = new HashMap<Integer,String>(10,0.8f);

        // insert - adding data
        zipMap.put(277001,"Ballia");
        zipMap.put(800001,"TataNagar");
        zipMap.put(277001, "Duplicate Ballia");
        zipMap.put(10000,"Ballia");

        //look up
        System.out.println(zipMap.get(277001));

        // delete
        zipMap.remove(10000);

        //Traversing
        for(Map.Entry mapElement: zipMap.entrySet()){
            Integer key = (Integer) mapElement.getKey();
            String value = (String) mapElement.getValue();
            System.out.println(key + " " + value);
        }
    }
}
