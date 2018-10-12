import java.util.Scanner;

public class Lab1_sqrt {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number to count the square root for:");
        double val=Double.parseDouble(input.next());

        System.out.println("please enter accuracy value:");
        int acc=Integer.parseInt(input.next());

        Sqrt sqrt=new Sqrt(val);

        double result=sqrt.calc(acc);
        System.out.println("Sqrt of "+ val +" with accuracy = "+ acc + " is " + result);
    }
}
