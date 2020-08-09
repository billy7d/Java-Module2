public class GenericStackClient {

    protected static void stackOfStrings(){
        MyGenricStack<String> stack = new MyGenricStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");

        System.out.println("1 Size of stack after push operations: " + stack.size());
        System.out.printf("2. Pop elements from stack : ");

        while(stack.isEmpty() == false){
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n1.3. Size of stack after pop operations : " + stack.size());

    }

    protected static void stackOfIntergers(){
        MyGenricStack<Integer> stack = new MyGenricStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("1. Size of stack after push "+stack.size());
        System.out.printf("2. Pop elements from stack: ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n3. Size of stack after pop operations : " + stack.size());
    }
}
