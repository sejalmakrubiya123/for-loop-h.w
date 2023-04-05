import java.util.Scanner;

public class CalculateTheSumOfFollowingSeries {


    //using main method


    public static void main(String[] args) {

        // take input from the user
        //create an instance of the scanner class

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of n : ");

        //declare and initialize the variable
        int n = input.nextInt();


        double sum = 0;

        //use a for loop to calculate the number.
        for (int i =1; i <= n; i++){

            sum += 1.0 / i;
        }

       // printing the sum of the series is
        System.out.println("The sum of the series is : "+ sum);

    }







}
