import java.util.Collections;
import java.util.Vector;

public class Q1 {
    public static void main(String[] args) {
        // adding to vector
        Vector<String> sv=new Vector<>();
        Collections.addAll(sv,args);
        System.out.println("String vector = "+sv);
        // converting from vector to array
        String[] str=new String[sv.size()];
        for(int i=0;i<sv.size();i++) {
            str[i]=sv.get(i);
        }
        // printing the array
        System.out.println("String array = ");
        for(String s:str) {
            System.out.println(s);
        }
    }
}
