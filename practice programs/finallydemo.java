import java.io.FileNotFoundException;
public class finallydemo {
    static void funcA() throws FileNotFoundException{
        try{System.out.println("inside funcA");
        throw new FileNotFoundException();

        }
        finally{
            System.out.println("inside Finally funcA");
        }
    }
    public static void main(String args[]) throws FileNotFoundException{
        funcA();
    }

}
