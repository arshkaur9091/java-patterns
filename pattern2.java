import java.util.*;

public class pattern2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num=scn.nextInt();

        // write ur code here
        for(int i=1;i<=num;i++)
        {
            for(int j=num;j>=i;j--)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
}