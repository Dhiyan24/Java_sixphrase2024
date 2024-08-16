import java.util.*;
public class thread01 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        firstthread t1=new firstthread();
        Secondthread t2=new Secondthread();
        t1.start();
        t2.start();

        try{
            
            t2.wait();
            t1.join();t2.join();
            System.out.println("This is Potatoooo !");
        }catch(Exception e){
            System.out.println(e);

        }

    }

}
class firstthread extends Thread{
    public void run(){
        Scanner in=new Scanner(System.in);
        int n=5;
        try{
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print("*");
                Thread.sleep(100);
            }System.out.println();
        }
            
     } catch(InterruptedException e){
            System.out.println("Distrubed !");
        }
    }
}
class Secondthread extends Thread{
    public void run(){
        Scanner in=new Scanner(System.in);
        int n=5;
        try{
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("*");
                Thread.sleep(100);
            }System.out.println();
        }
            
     } catch(InterruptedException e){
            System.out.println("Distrubed !");
        }
    }
}
