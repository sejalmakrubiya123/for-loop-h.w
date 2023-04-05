import java.util.Scanner;

public class PrimeNumber {

    //main method
    public static void main(String[] args) {

       // create an instance of the  scanner class
        Scanner sc = new Scanner(System.in);

     //declare a variable
        System.out.println("Enter a number : ");


        //ask the user to initialize the variable

        int num = sc.nextInt();

        // call a method that will check whether the entered number is prime or not

        if (checkPrime(num)) {
            System.out.println(num + " is a prime number");
        }
        else
        {
            System.out.println(num + " is not a prime number");
        }
    }

    public static boolean checkPrime(int num)
    {
        //if the number is 0 or 1, print it is not prime number.
        if (num <= 1)
        {
            return false;
        }
        //if the number is other than 0 and 1, then run a for loop from to the square root of that number.
        for (int i = 2; i < Math.sqrt(num); i++)
        {

            if (num % i == 0)
            {
                //if the number is divisible by any of the numbers in that loop, then print it as not a prime number.
                return false;
            }
        }
         //if the number is divisible by any of the numbers in that loop, then print it as a prime number.
        return true;
    }
}



















