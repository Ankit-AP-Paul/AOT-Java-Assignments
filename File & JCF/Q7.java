import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Q7 {
    public static void main(String[] args) {
        try {
            FileReader fr=new FileReader("input.txt");
            BufferedReader br=new BufferedReader(fr);
            String line;
            StringTokenizer st;
            while((line=br.readLine())!=null) {
                st=new StringTokenizer(line);
                while(st.hasMoreTokens()) {
                    System.out.println(st.nextToken());
                }
            }
            br.close();
        } catch (Exception e) {
            System.err.println(e);
            e.printStackTrace();
        }
    }
}
