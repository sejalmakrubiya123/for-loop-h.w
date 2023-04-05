import java.util.Scanner;

public class DisplaySumOfNNaturalNumber {
    //java program to display numbers
    //from 1 to n using for loop and
    //sum of first n natural number
    public static void main(String[] args)
    {
        int i , n, sum=0;
        {
            Scanner scanner = new Scanner(System.in) ;
                    System.out.println("Input number : ");
                 n = scanner.nextInt();
        }
        System.out.println(" The first n natural numbers are : "+n);

        //we initialize the value of the variable i
        //with 1 and increment each time with 1
        for (i=1;i<=n;i++)
        {
            System.out.println(i);
            sum+=i;
        }
        System.out.println("The Sum of Natural Number upto " +n+ " terms : " + sum);

    }


}
