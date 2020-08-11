import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Smith",30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        System.out.println("Tat ca hashmap");
        System.out.println(hashMap);




        Map<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("Smith",30);
        treeMap.put("Anderson", 31);
        treeMap.put("Lewis", 29);
        treeMap.put("Cook", 29);
        System.out.println("Hien thi thep treeMap");
        System.out.println(treeMap);


        Map<String,Integer> linkedHaspMap = new LinkedHashMap<>();
        linkedHaspMap.put("Hung",15);
        linkedHaspMap.put("Lam",11);
        linkedHaspMap.put("Hai",19);
        linkedHaspMap.put("Tuan",15);

        System.out.println("get Hung age value: "+linkedHaspMap.get("Hai"));

    }
}
