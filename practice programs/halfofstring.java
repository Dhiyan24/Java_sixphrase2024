// Half of String if length of String is even print else null
import java.util.*;
public class halfofstring {
    public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    int n=s.length();
    if(n%2==0){
        String s1=s.substring(0,n/2);
        System.out.print(s1);
    }
    else{
        System.out.print("null");
    }




}}