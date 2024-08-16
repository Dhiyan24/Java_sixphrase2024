import java.util.*;
public class ignorex {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        if(s.charAt(0)=='x' && s.charAt(s.length()-1)=='x'){
            String s1=s.substring(1,s.length()-1);
            System.out.print(s1);
        }else if(s.charAt(0)=='x'){
            String s1=s.substring(1,s.length());System.out.print(s1);
        }
        else if(s.charAt(0)=='x'){
            String s1=s.substring(0,s.length()-1);System.out.print(s1);
        }
        else
        {
            System.out.print(s);
        }
    }}