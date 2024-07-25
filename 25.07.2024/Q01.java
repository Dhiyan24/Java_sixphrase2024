import java.util.*;
public class Q01 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter String :");
        String s=in.nextLine();
        s=s.replaceAll("[a-zA-z]", "");
        Stack<Integer> a=new Stack();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                int x=s.charAt(i)-'0';
                a.push(x);
            }

        }
        for(int i=0;i<s.length();i++){
            int x,y;
            if(s.charAt(i)=='+'){
                x= a.pop();
                y=a.pop();
                a.push(x+y);
                
            }
            if(s.charAt(i)=='-'){
                x= a.pop();
                y=a.pop();
                a.push(x-y);
                
            }
            if(s.charAt(i)=='*'){
                x= a.pop();
                y=a.pop();
                a.push(x*y);
                
            }
            if(s.charAt(i)=='/'){
                x= a.pop();
                y=a.pop();
                a.push(x/y);
                
            }
        }
        System.out.println("The answer is :"+a.get(0)); 
    
    }}