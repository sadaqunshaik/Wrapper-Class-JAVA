
import java.io.IOException;
import java.util.*;



class Name{
    public static void main(String[] args)throws IOException {   

      Scanner sc = new  Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        String str=Integer.toString(num);
        System.out.println(str);
        System.out.println(str+40);
    }
}