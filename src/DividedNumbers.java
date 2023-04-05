import java.util.Scanner;

public class DividedNumbers {

// main method
    public static void main(String[] args) {

       // take input from the user
                //create an instance of the scanner class
        Scanner input =new Scanner(System.in);

        int n;

        System.out.println("Range of the number : ");

        n=input.nextInt();
       // //use a for loop to calculate the number.
        System.out.println("Divided by : 3");
        for (int i =1; i <= n; i++){
           if(i%3==0) System.out.println(i+" , ");
        }
        System.out.println("\nDivided by : 5");
        for (int i = 1; i <= n;i++){
            if(i%5 ==0) System.out.println(i+",");
        }
        System.out.println("\nDivided by: 3 & 5");
        for (int i = 1; i <=n; i++){
            if(i%3==0 && i%5==0) System.out.println(i+",");
        }
    }

}
