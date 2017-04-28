import java.util.Stack;

/**
 * Created by MichaelRajchert on 28/04/2017.
 */

class StackOperations{
    public static <T> void stackPush(T stack, T element){
        try {
            System.out.print("Push " + element + " -> ");
            stackStats(stack);
        } catch (Exception E){
            System.out.print(E);
        }
    }
    public static <T> void stackPop(Stack stack){

    }
    public static <T> void stackPeek(Stack stack){

    }
    public static <T> void stackMin(Stack stack){

    }
    public static <T> void stackStats(Stack stack){
        //FIND MAX
        T stackMax = null;
        T temp = null;
        for (int i = 0; i < stack.size(); i++){

        }
        //FIND MIN
        T stackMin = null;
    }
}