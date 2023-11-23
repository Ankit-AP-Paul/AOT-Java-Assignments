import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Q6 {
    public static void main(String[] args) {
        try {
            FileReader fr1=new FileReader("file1.txt");
            FileReader fr2=new FileReader("file2.txt");
            FileWriter fw=new FileWriter("file3.txt");
            BufferedWriter bw=new BufferedWriter(fw);

            BufferedReader br=new BufferedReader(fr1);
            String line;
            while((line=br.readLine())!=null) {
                bw.write(line);
                bw.newLine();
            }
            br.close();

            br=new BufferedReader(fr2);
            while((line=br.readLine())!=null) {
                bw.write(line);
                bw.newLine();
            }
            br.close();
            bw.close();
        } catch(Exception e) {
            System.err.println(e);
            e.printStackTrace();
        }
    }
}
