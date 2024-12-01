import java.util.*;

class hollowRhombusStar {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++)
            {
              if(i==1 || j==n || j==1 || i==n){
                System.out.print("* ");
              }
              else{
                System.out.print("  ");
              }
            }
                System.out.println();   
        }
    }
}
