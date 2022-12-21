import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        circle c1 = new circle(3.0);
        cylinder d1 = new cylinder(5.0);


        while (true) {
            System.out.println("please enter suitable number");
            System.out.println("1--> want the area of circle");
            System.out.println("2--> want the volume of cylinder");
            System.out.println("3-->exit");
            Scanner input = new Scanner(System.in);
            int x = input.nextInt();
            switch (x) {
                case 1:
                    System.out.println("please enter the raduis of circle");
                    double r = input.nextDouble();
                    c1.setRadius(r);
                    System.out.println("the area is : " + c1.getarea());
                    break;

                case 2:
                    System.out.println("please enter the raduis of circle");
                    r = input.nextDouble();
                    System.out.println("please enter the height of the cylinder");
                    double h = input.nextDouble();
                    d1.setHeight(h);
                    System.out.println("the volume is : " + d1.getvolum());
                case 3:
                    break;
            }
        }
    }

    public static class cylinder extends circle {

        private double height;

        public cylinder() {
        }

        public cylinder(double h) {
            height = h;

        }

        public cylinder(double h, double r) {
            super(r);
            height = h;
        }

        public cylinder(double h, double r, String c) {
            super(r, c);
            height = h;

        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getvolum() {

            return 3.14 * Radius * Radius * height;

        }

    }

    public static class circle {

        protected double Radius;
        protected String color;

        public circle() {
            Radius = 1.0;
            color = "red";


        }

        public circle(double r) {

            Radius = r;

        }

        public circle(double r, String c) {

            Radius = r;
            color = c;

        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public double getRadius() {
            return Radius;
        }

        public void setRadius(double Radius) {
            this.Radius = Radius;
        }

        public double getarea() {

            return 3.14 * Radius * Radius;

        }

    }
}