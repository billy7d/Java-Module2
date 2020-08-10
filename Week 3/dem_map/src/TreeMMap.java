
import java.util.TreeMap;

public class TreeMMap {
    public static void main(String[] args) {
        TreeMap<String,Integer> map = new TreeMap<>();
        String str = "abc con ga be bo con con cho";
        String[] split = str.split(" ");


        int value =1;

        for (int i = 0; i < split.length; i++) {
                if (map.containsKey(split[i])) {
                    value++;

                } map.put(split[i], value);

        }



        System.out.println(map);


    }
}
