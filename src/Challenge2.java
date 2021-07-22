import java.util.*;
public class Challenge2 {


    public static String findSquares(int n)
    {
        int min=n/2;
        int max=min+1;
        return String.valueOf(max*max)+"-"+String.valueOf(min*min);
    }
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the odd number 1-999999");
        int n=scn.nextInt();
        if(n>0&&n<1000000&&n%2!=0)
        {
            System.out.println(findSquares(n));
        }
       else
        {
            System.out.println("invalid input");
        }

    }
}
