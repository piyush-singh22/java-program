class pr_7 {

    public static class rectangle {
        int height;
        int width;

        public rectangle() {
            // System.out.println("without parameter");
            this(3, 5);
        }

        public rectangle(int height, int width) {
            this.height = height;
            this.width = width;
        }

        public void display() {
            System.out.println("height:" + height);
            System.out.println("width:" + width);
        }
    }

    public static void main(String[] args) {
        System.out.println("216090307096 - Piyush Singh");

        rectangle r1 = new rectangle();
        rectangle r2 = new rectangle(164, 58);
        r1.display();
        r2.display();
    }
}