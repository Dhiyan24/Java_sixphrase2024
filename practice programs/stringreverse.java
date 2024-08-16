import java.util.*;
public class stringreverse {
    public static void main(String args[]){
        String s1=" ";
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        for(int i=s.length()-1;i>=0;i--){
            s1+=s.charAt(i);
        }
        if(s.equals(s1)){
        System.out.print("Palindrome");}
        else{
        System.out.print("Not Palindrome");

    }
    
}
}