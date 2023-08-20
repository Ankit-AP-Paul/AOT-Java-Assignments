import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CommandLineInput {
    public static void main(String[] args) {
        int n1,n2;
        n1=Integer.parseInt(args[0]);
        n2=Integer.parseInt(args[1]);
        System.out.println("Sum = "+(n1+n2));
    }
}

class ScannerInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter 2 numbers = ");
        n1=sc.nextInt();
        n2=sc.nextInt();
        System.out.println("Sum = "+(n1+n2));
    }
}

class BufferedReaderInput {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n1,n2;
        System.out.println("Enter 2 numbers = ");
        n1=Integer.parseInt(br.readLine());
        n2=Integer.parseInt(br.readLine());
        System.out.println("Sum = "+(n1+n2));
    }
}