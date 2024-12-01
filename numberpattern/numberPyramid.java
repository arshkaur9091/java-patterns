import java.util.Scanner;

class NumberPyramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pyramid: ");
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) 
            {
                System.out.print(" "); 
            }
            for (int j = 1; j <= i; j++) 
            {
              System.out.print(i+" ");
            }
            System.out.println(); 
        }
    }
}
