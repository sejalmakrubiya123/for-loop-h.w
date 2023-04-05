import java.util.Scanner;

public class FactorialOfNumber {



     //main method
    public static void main(String[] args) {

        // take input from the user
        //create an instance of the scanner class

        Scanner scanner = new  Scanner(System.in);

        //declare and initialize the variable

        System.out.println("Enter the number : ");

        int num = scanner.nextInt();

        //initialize the variable to 1

        int fact=1;

        //use a for loop to calculate the factorial.
        for (int i=1;i<=num;i++)
        {
            //update tje factorial variable by multiplying it with the loop variable in each iteration
            fact=fact*i;
        }
        //print the factorial of the number.
        System.out.println("Factorial of the number : " +fact);

    }
}
