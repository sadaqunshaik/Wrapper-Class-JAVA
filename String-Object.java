
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Name{
    public static void main(String[] args)throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int num=Integer.parseInt(br.readLine());
        System.out.println(num);
    }
}