import java.util.ArrayList;
import java.util.Collections;

class Simpson implements Comparable<Simpson> {
    String name;

    Simpson(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Simpson simpson) {
        return this.name.compareTo(simpson.name);
    }
}

public class SimpsonSorting {

    public static void main(String... sortingWithList) {
        List<SimpsonCharacter> simpsons = new ArrayList<>();
        simpsons.add(new SimpsonCharacter("Homer "));
        simpsons.add(new SimpsonCharacter("Marge "));
        simpsons.add(new SimpsonCharacter("Bart "));
        simpsons.add(new SimpsonCharacter("Lisa "));

        Collections.sort(simpsons);
        simpsons.stream().map(s -> s.name).forEach(System.out::print);

        Collections.reverse(simpsons);
        simpsons.stream().forEach(System.out::print);
    }

}
