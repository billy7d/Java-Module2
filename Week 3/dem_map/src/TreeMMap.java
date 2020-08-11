
import java.util.TreeMap;

public class TreeMMap {
    public static void main(String[] args) {
        TreeMap<String,Integer> map = new TreeMap<>();
        String str = "Abc con be con bo";
        String[] split = str.split(" ");
        int value =1;

        for (int i = 0; i < split.length; i++) {
            if (map.containsKey(split[i])){
               value = map.get(split[i]);
               map.replace(split[i],++value);

            }map.put(split[i],value);
        }

        System.out.println(map);


    }
}
