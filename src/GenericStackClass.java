import java.util.LinkedList;

/**
 * Created by MichaelRajchert on 5/05/2017.
 */
public class GenericStackClass {
    public static LinkedList linkedList = new LinkedList();

    public static <T> void push(T element){
        linkedList.add(element);
        System.out.println("Push " + element + " -> Top = " + top() + ", min = " + min());
    }
    public static <T> String pop(){
        return "";
    }
    public static <T> void peek(){

    }
    public static <T> String min(){
        String temp = linkedList.get(0).toString(); //Assume first index is min
        for (int i = 1; i < linkedList.size(); i++){
            if (temp.compareTo(linkedList.get(i).toString()) > 0){
                temp = linkedList.get(i).toString();
            }
        }
        return temp;
    }

    public static String top(){
        return linkedList.get(linkedList.size()-1).toString();
    }
}
