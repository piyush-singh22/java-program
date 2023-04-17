import java.util.Scanner;

public class pr_10 {
    public static void main(String args[]) {
        System.out.println("216090307096 - Piyush Singh");

        float t;
        final float pi = (float) 3.14;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of radius:");
        float r = sc.nextFloat();

        t = pi * r * r;

        System.out.println("the Area of circle is:" + t);
    }
}