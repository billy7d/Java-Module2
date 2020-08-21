import java.util.ArrayList;
import java.util.List;

public class WordManager {
//    List<Word> list;
    Word wordObj;

    public void addWord(List<Word> list,Word wordObj){

        list.add(wordObj);
    }

    public Word removeWord(List<Word> list, String name) {


        for (Word i : list) {
            if (i.getName().equals(name)) {
                list.remove(i);
                return i;
            }
        }
        return null;
    }

    public void showWords(List<Word> list){
        for (Word word:list){
            System.out.println(list.toString());
        }
    }


    public Word findWord(List<Word> list, String name){

        for (Word i: list){
            if (i.getName().equals(name))
                return i;
        }
        return null;
    }



}
