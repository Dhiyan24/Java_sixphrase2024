//Write a program to initialize an integer array with value and check if the given number is present in array or not
import java.util.*;
public class checkelement {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int m=in.nextInt();int c=0;
        for(int i=0;i<n;i++){
            if(a[i]==m){
                System.out.println("The element "+a[i]+" is found at index "+i);
                c=1;
            }
        }
        if(c==0){
            System.out.println("Not Found"+-1);
        }
    }
    
}
