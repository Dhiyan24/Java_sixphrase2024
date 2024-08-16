//example 235 = 2*3 + 3*2 + 5*1 = 22 is answer !
import java.util.*;
public class sumpower{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();int i=1;int m=0;int t=0;
        while(n>0)
        {
           m=n%10;
           t+=Math.pow(m,i++);
           n=n/10;
        }
        System.out.println(t);
    }
}