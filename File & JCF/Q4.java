import java.io.BufferedReader;
import java.io.FileReader;

public class Q4 {
    public static void main(String[] args) {
        try {
            FileReader fr=new FileReader("input.txt");
            BufferedReader br=new BufferedReader(fr);
            String line;
            while((line=br.readLine())!=null) {
                System.out.println(line);
            }
            br.close();
        } catch (Exception e) {
            System.err.println(e);
            e.printStackTrace();
        }
        
    }
}