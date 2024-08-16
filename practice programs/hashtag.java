import java.util.*;
public class hashtag {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();int count=0;int a=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                count++;
            }
            if(s.charAt(i)=='*'){
                a++;
            }
        }
        System.out.println(count-a);
    }
    
}
