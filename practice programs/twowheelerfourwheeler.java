// input vehicles and wheels gives the tw and four wheels
import java.util.*;
public class twowheelerfourwheeler {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Number of Vehicles :");
        int v=in.nextInt();
        System.out.println("Enter Number of Wheels :");
        int w=in.nextInt();
        int tw=((v*4)-w)/2;
        if(w>2 && (w%2==0) && w>v){
            System.out.print("Two wheeler : "+tw+" Four Wheeler :"+(v-tw));
        }
    }
    
}
