import java.util.*;

class pattern1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        // write ur code here
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++)
            {
                System.out.print("* ");
            }
                System.out.println();   
        }
    }
}