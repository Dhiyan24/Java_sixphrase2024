import java.util.*;
public class ignorestar
{
     public static void main(String[] args)
     {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                int l=i-1;
             String s1=s.substring(0,l);
             String s2=s.substring(i+2,s.length()-1);
            s1=s1.concat(s2);
             System.out.print(s1);
                
            }
            else{
                System.out.print(s);
            }
        }
     }}