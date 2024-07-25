import java.util.*;
public class Q02 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("The number of elements in the Array :");
        int n=in.nextInt();
        System.out.println("Enter elements in the Array :");
        int [] a=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
            if(prime(a[i])){
                 c++;
            }
        }int sum=0,j=0;
        int[] b=new int[c];
        for(int i=0;i<n;i++){
            if(prime(a[i])){
                b[j++]=a[i];         
         }}
        Arrays.sort(b);
        for(int i=1;i<b.length;i++){
            sum+=b[i];}
       System.out.print("The sum of prime number :"+sum);
            
        }
       static boolean prime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }        }
        return true;
        

    }

}