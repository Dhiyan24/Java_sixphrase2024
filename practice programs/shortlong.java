import java.util.*;
public class shortlong {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String s1=in.nextLine();
        if(s.length()>s1.length()){
            System.out.print(s1+s+s1);
        }
        else{
            System.out.print(s+s1+s);
        }
    
    }}