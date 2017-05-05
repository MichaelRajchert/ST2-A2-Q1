import java.util.Stack;

/**
 * Created by MichaelRajchert on 28/04/2017
 *
 * For ST2-ASSIGNMENT1-Q1
 */
public class main{
    public static GenericStackClass genStack = new GenericStackClass();

    public static void main(String[] args){
        genStack.stackInfo();
        genStack.push(32);
        genStack.push(43);
        genStack.push(16);
        genStack.pop();
        genStack.pop();
        genStack.pop();
    }
}