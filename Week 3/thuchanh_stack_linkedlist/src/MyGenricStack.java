import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenricStack<T> {
    private LinkedList<T> stack;

    public MyGenricStack(){
        stack = new LinkedList();
    }

   public boolean isEmpty(){
        if (stack.size() == 0)
            return true;
        else return false;
   }


    public void push(T element){
        stack.addFirst(element);
    }

    public T pop(){
       if (isEmpty())
           throw new EmptyStackException();
       else
        return stack.removeFirst();

    }

    public int size(){
        return stack.size();
    }

}
