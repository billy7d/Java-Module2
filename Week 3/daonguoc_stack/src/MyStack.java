import java.util.ArrayList;

public class MyStack<T> {

    private ArrayList<T> list;
    private ArrayList<T> list2 = new ArrayList<>();



    public MyStack(){
        list = new ArrayList<T>();
    }

    public void push(T element){
        list.add(element);
    }

    public T pop(){
        Object popElement;
        if (!isEmpty()) {
            popElement = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return (T) popElement;
        } else
            return null;
    }

    public void reverse() {
        if (!list.isEmpty()) {
            for (int i = list.size(); i > 0; i--) {
                list2.add(list.remove(list.size()-1));
            }
        } list = list2;
    }

    public boolean isEmpty(){
        if (list.isEmpty())
            return true;
        else return false;
    }

    public int size(){
        return list.size();
    }

    public String[] split(String list,String seperator){
        if (!isEmpty()){
           String[] result = list.split(seperator);
           return result;
        }
        else return null;
    }



    @Override
    public String toString() {
        return "MyStack{" +
                "list=" + list +
                '}';
    }

}
