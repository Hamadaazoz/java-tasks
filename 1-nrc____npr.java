import java.util.Scanner;
//////////////////////////program to print  ncr and npr
class NcrAndNpr
{
    double fact(double n)
    //////////////////////////function to give you the factorial of the number
    {
        int i=1;
        double fact=1;
        while(i<=n)
        {   fact=fact*i;
            i++;}   return fact;    }
    //////////////////////////function to get permutation of the numbers
    double permutation(int n,int r )
    {double per=fact(n)/fact(n-r);
        return per;}
    //////////////////////////function to get combination of the numbers

    double combination(int n,int r)
    {double com=fact(n)/(fact(n-r)*fact(r));
        return com;
    }
    //////////////////////////main program to get ncr and npr of the numbers

    public static void main(String arg[])
    {
        NcrAndNpr p=new NcrAndNpr( );
        Scanner sc=new Scanner(System.in);
        //////////////////////////grt the values of the two  numbers from user

        System.out.println("enter value of n");
        int n=sc.nextInt();
        System.out.println("enter value of r");
        int r=sc.nextInt();
        if(n>=r)
        {
            //////////////////////////call functions for ncr and npr

            System.out.println("The value of "+n+"p"+r+" is : "+p.permutation(n,r));
            System.out.println("The value of "+n+"c"+r+" is : "+p.combination(n,r));
        }
        else
            System.out.println("n value should be greater than or equals to r value");

    }
}