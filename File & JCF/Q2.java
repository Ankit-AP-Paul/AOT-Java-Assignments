import java.util.Collections;
import java.util.Vector;

public class Q2 {
    public static void main(String[] args) {
        Vector<String> sv=new Vector<>();
        Collections.addAll(sv,args);
        System.out.println("Shopping list items = "+sv);
    }
}
