import java.util.LinkedList;

/**
 * Created by MichaelRajchert on 5/05/2017.
 */
public class GenericStackClass {
    public static LinkedList linkedList = new LinkedList();

    public static <T> String peek(){
        return linkedList.get(linkedList.size()-1).toString();
    }
    public static <T> String pop(){
        String output;
        if (linkedList.size() != 0) {
            output = linkedList.get(linkedList.size() - 1).toString();
            linkedList.remove(linkedList.size() - 1);
            System.out.println("Pop -> top = " + top() + ", min = " + min());
        } else {
            System.out.println("Pop -> top = " + top() + ", min = " + min());
            return null;
        }
        return output;
    }
    public static <T> void push(T element){
        linkedList.add(element);
        System.out.println("Push " + element + " -> Top = " + top() + ", min = " + min());
    }

    public static <T> String min(){
        if (linkedList.size() != 0) {
            String temp = linkedList.get(0).toString(); //Assume first index is min
            for (int i = 1; i < linkedList.size(); i++) {
                if (temp.compareTo(linkedList.get(i).toString()) > 0) {
                    temp = linkedList.get(i).toString();
                }
            }
            return temp;
        } else {
            return null;
        }
    }
    public static String top(){
        if (linkedList.size() != 0) {
            return linkedList.get(linkedList.size() - 1).toString();
        } else {
            return null;
        }
    }

    public static void stackInfo(){
        String stackSize = "";
        if (linkedList.size() == 0){
            stackSize = "empty";
        } else {
            stackSize += linkedList.size();
        }
        System.out.println("Stack " + stackSize + " -> top = " + top() + ", min = " + top() );
    }
}