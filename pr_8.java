class pr_8 {
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

        demo d1 = new demo("Piyush");

        d1.display();
    }
}