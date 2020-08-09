import java.util.ArrayList;

public class MyStack<T> {

    ArrayList<T> list;
    ArrayList<T> newList =new ArrayList<>();

    public MyStack(){
        list = new ArrayList<T>();
    }

    public void add(int index,T element){
        list.add(index,element);
    }

    public T remove(int index){
       return list.remove(index);

    }
    public int size(){
        return list.size();
    }





    public void swap(){

        for (int i = list.size()-1;i>0 ;i--){
            newList.add(list.size()-1-i, list.get(i));
            list= newList;
        }

    }


    @Override
    public String toString() {
        return "MyStack{" +
                "list=" + list +
                '}';
    }
}
