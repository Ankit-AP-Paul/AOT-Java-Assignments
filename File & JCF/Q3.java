import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector<String> sv=new Vector<>();
        Collections.addAll(sv,args);
        System.out.println("Shopping list items = "+sv);
        int ch,pos;
        String item;
        while (true) {
            System.out.println("1. Delete item\n2. Add item to specified position\n3. Add item at end\n4. Display items\nAny other key to exit");
            System.out.print("Enter your choice...");
            ch=sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter the item to delete...");
                    item=sc.next();
                    sv.remove(item);
                    break;
                case 2:
                    System.out.print("Enter the item to to be inserted...");
                    item=sc.next();
                    System.out.print("Enter the position...");
                    pos=sc.nextInt();
                    sv.insertElementAt(item, pos-1);
                    break;
                case 3:
                    System.out.print("Enter the item to be inserted at end...");
                    item=sc.next();
                    sv.add(item);
                    break;
                case 4:
                    System.out.println("Shopping list items = "+sv);
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
