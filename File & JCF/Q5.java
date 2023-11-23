import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        FileWriter fw=new FileWriter("Output.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        String line;
        while(true) {
            System.out.print("Enter...");
            line=sc.nextLine();
            if(line.equals("q")) {
                break;
            }
            else {
                bw.write(line);
                bw.newLine();
            }
        }
        bw.close();
    }
}
