import java.util.Scanner;

public class pr_5 {
    public static void main(String args[]) {
        System.out.println("216090307096 - Piyush Singh");

        Scanner sc = new Scanner(System.in);
        int i, j;
        System.out.print("Enter the n number:");
        int n = sc.nextInt();
        for (i = 2; i <= n; i++) {
            for (j = 2; j <= i; j++) {
                if (i % j == 0)
                    break;
            }
            if (i == j)
                System.out.println("Prime Number:" + i);

        }
    }
}