import java.util.Scanner;
////////////////////////// program to print asscii code of the character
public class AsciiValue {

    public static void main(String[] args)
    {
        //////////////////////////get the character
        System.out.println("enter character : ");
        Scanner input =new Scanner(System.in);

        char c = input.nextLine().charAt(0);
        int ascii=c;
        //////////////////////////print the asscii code of character
        System.out.println("The ASCII value of " + c + " is: " + ascii);
    }
}