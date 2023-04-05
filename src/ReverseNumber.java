import java.util.Scanner;

public class ReverseNumber {
    //main method

    public static void main(String[] args)
    {
        Scanner scanner = new  Scanner(System.in);

        System.out.println("Enter the  number : ");

        int num = scanner.nextInt();
        int number = 123456, reverse = 0;

//we have not mentioned the initialization part of the for loop
        for( ;number != 0; number=number/10)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("The reverse of the given number is : " + reverse);
    }
}

