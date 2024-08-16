import java.util.*;
public class concat {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String s1=in.nextLine();
        s1=s.concat(s1);
        System.out.println(s1.toLowerCase());
    }
    
}
