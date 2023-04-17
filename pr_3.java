import java.util.Scanner;

public class pr_3 {
    public static void main(String[] args) {
        System.out.println("216090307096 - Piyush Singh");
        Scanner sc = new Scanner(System.in);
        // declare variable
        int a, ans, r, e;
        ans = 0;

        // input:
        System.out.println("enter the number for reverse:");
        a = sc.nextInt();
        // loop:
        while (a != 0) {
            r = a % 10;
            ans = ans * 10 + r;
            a = a / 10;
        }

        // print;
        System.out.println("reversed:" + ans);
    }
}
