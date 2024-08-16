import java.util.*;
public class pattern {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("Right Pyramid");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }System.out.println( );
        }
        System.out.println("Reverse number Pyramid");
        {
            for(int i=n;i>=1;i--){
                for(int j=i;j>=1;j--){
                    System.out.print(j+" ");
                }System.out.println();
            }
        }
        System.out.println("Pyramid");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }    
}

