//integer array to ascii values
import java.util.*;
public class inttoasci {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        char[] b=new char[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=(char)a[i];
            System.out.println((char)a[i]+"="+(int)b[i]);
        }

    }
}
