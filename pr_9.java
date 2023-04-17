
public class pr_9 {
    public static class demo {
        String name;

        demo(String name) {
            this.name = name;
        }

        public void display() {
            System.out.println("name:" + name);
        }

    }

    public static void main(String args[]) {
        System.out.println("216090307096 - Piyush Singh");

        demo d = new demo("Abhimanyu");

        d.display();
    }
}
