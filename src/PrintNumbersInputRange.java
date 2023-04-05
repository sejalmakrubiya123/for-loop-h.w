import java.util.Scanner;
/* printing numbers by asking users
using for loop we can print numbers range like 23-33
scanner is used for taking input value
 */
public class PrintNumbersInputRange {
    //using main method

    public static void main(String[] args) {
        //
        Scanner scanner = new Scanner(System.in);
        int a,b,i,j;
        System.out.println("From which number do you want to print : ");
        a= scanner.nextInt();

        System.out.println("Up to which number do you want to print : ");
        b= scanner.nextInt();

        for (i=a;i<=b;i++)
        {

            System.out.println(i);
        }

    }
}
