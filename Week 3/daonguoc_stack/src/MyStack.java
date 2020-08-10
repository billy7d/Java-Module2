import java.util.ArrayList;

public class MyStack<T> {

    private ArrayList<T> list;


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

    public boolean isEmpty(){
        if (list.isEmpty())
            return true;
        else return false;
    }

    public int size(){
        return list.size();
    }

    public String[] split(String seperator){
        if (!isEmpty()){
           String[] result=  split(seperator);
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
