import java.util.*;
class maxrowinmatrix{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("Rows :");
        int r=in.nextInt();
        System.out.print("Columns :");
        int c=in.nextInt();
        int count=0;int m=0;int index=0;
        int[][] a=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(a[i][j]==1){
                    count++;
                }

            }if(count>m){
                m=count;
                index=i+1;
            }
        }System.out.print("The maximum 1 in the row is :"+index);

    }
}