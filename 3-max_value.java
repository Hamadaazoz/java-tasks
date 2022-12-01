import java.util.Scanner;
//pgram to print maximum value of array
public class max_value {
    public static void main(String[] args) {
        System.out.println("please enter the element of arr");
        int i;
        int x=0;
        //get array from user//////////////////////////////////////////////////
        Scanner input =new Scanner(System.in);
        int []arr=new int [5];
        for(i=0;i<5;i++)
        {
            arr[i]= input.nextInt();
        }
        int max=0;
        //get maximum from array/////////////////////////////////////////////////
        for(i=0;i<5;i++)
        {
        if(arr[i]>max)
        { max=arr[i];
             x=i;
        }}
        /////////////////////////////////////////////////print the maximum value
        System.out.println("the max value is " );
        System.out.println("arr["+x+"]"+"= "+max );
    }
}
