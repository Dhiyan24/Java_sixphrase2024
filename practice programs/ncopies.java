import java.util.*;
public class ncopies {
    public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    in.nextLine();
    String s=in.nextLine();
    for(int i=0;i<n;i++){
        String s1=s.substring(0,2);
        System.out.print(s1);
    }    
}
}
