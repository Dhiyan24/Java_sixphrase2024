//Write a program to initialize an interger array and find the minimum and maximum of the array
import java.util.*;
public class minandmax{
    public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
        a[i]=in.nextInt();
    }
    Arrays.sort(a);
    System.out.println(a[n-1]+"The maximum element in the array");
    System.out.println(a[0]+"The minimum element in the array");
    }
    
}
