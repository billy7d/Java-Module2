
import java.util.TreeMap;

public class TreeMMap {
    public static void main(String[] args) {
        TreeMap<String,Integer> map = new TreeMap<>();
        String str = "Abc con be con bo";
        String[] split = str.split(" ");
        int key =1;

        for (int i = 0; i < split.length; i++) {
            map.put(split[i],key);
        }

        System.out.println(map);


    }
}
