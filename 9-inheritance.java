import java.util.Scanner;
////////////////////////////////////////////////////project inheritance cylinder from circle
public class Main {
    public static void main(String[] args) {
        cylinder rr=new cylinder();
Scanner input =new Scanner(System.in);
//////////////////////////////////////////////////////take raduis and height from user
        System.out.println("enter the raduis : ");
       rr.raduis=input.nextInt();
        System.out.println("enter the height : ");
       rr.height=input.nextInt();
        System.out.println("area of cicle : "+rr.area());
        System.out.println("the  volume of the cylinder is  : "+rr.volume());


    }
}
//////////////////////////////////////////////////////class of circle in it (area function )
  class circle{
     int height ;
      int raduis;
     public double area()
    {
        return raduis*raduis*3.14;
    }
}
/////////class of cylinder in it (volume function that inherate from circle its parameter)

 class cylinder extends circle{
    public double volume()
    {
        return super.area()*height;
    }


  }