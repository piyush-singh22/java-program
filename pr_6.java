import java.util.Scanner;

public class pr_6 {
    public static class student {
        int eno;
        String name;

        public void get_data(int eno, String name) {
            this.eno = eno;
            this.name = name;
        }

        public void display() {
            System.out.print("name:" + name);
            System.out.println("enrollment number:" + eno);
        }

    }

    public static void main(String[] args) {
        System.out.println("216090307096 - Piyush Singh");

        Scanner sc = new Scanner(System.in);

        int a, b, c;
        String d, e, f;

        student s1 = new student();
        student s2 = new student();
        student s3 = new student();

        System.out.println("enter the enrollment number s1 :");
        a = sc.nextInt();
        System.out.println("enter the name of s1:");
        d = sc.next();

        s1.get_data(a, d);
        s1.display();

        System.out.println("enter the enrollment number s2 :");
        b = sc.nextInt();
        System.out.println("enter the name of s2:");
        e = sc.next();

        s2.get_data(b, e);
        s2.display();

        System.out.println("enter the enrollment number s3 :");
        c = sc.nextInt();
        System.out.println("enter the name of s3:");
        f = sc.next();

        s3.get_data(c, f);
        s3.display();
    }

}
