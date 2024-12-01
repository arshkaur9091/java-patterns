import java.util.*;

public class pattern5 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int space=n/2,star=1;
        for(int row=1;row<=n;row++)
        {
            for(int i=1;i<=space;i++)
            {
                System.out.print("\t");
            }
            for(int j=1;j<=star;j++)
            {
                System.out.print("*\t");
            }
            System.out.println();


            if(row<=n/2)
            {
                space=space-1;
                star=star+2;
            }
            else
            {
                space=space+1;
                star=star-2;
            }
        }

    }
}