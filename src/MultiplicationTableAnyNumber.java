import java.util.Scanner;

public class MultiplicationTableAnyNumber {

//main method
    public static void main(String[] args) {

        // create an instance of the  scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number : ");

        //ask the user to initialize the variable
        int n=scanner.nextInt();

        for (int i=1; i <= 10; i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}
