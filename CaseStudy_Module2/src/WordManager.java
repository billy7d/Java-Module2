import java.util.ArrayList;

public class WordManager {
    ArrayList<Word> arrayList;
    Word wordObj;

    public void addWord(Word wordObj){

        arrayList = new ArrayList<>();
        arrayList.add(wordObj);
    }

    public Word removeWord(String name) {

        arrayList = new ArrayList<>();
        Word removeWord;
        for (Word i : arrayList) {
            if (i.getName().equals(name)) {
                arrayList.remove(i);
                return i;
            }
        }
        return null;
    }


    public Word findWord(String name){
        arrayList = new ArrayList<>();
        for (Word i: arrayList){
            if (i.getName().equals(name))
                return i;
        }
        return null;
    }


    @Override
    public String toString() {
        return "WordManager{" +
                "arrayList=" + arrayList +
                ", wordObj=" + wordObj +
                '}';
    }
}
