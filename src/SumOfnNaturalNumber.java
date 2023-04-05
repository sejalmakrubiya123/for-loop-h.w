public class SumOfnNaturalNumber {

    //java program to display numbers
    //from 1 to n using for loop and
    //sum of first n natural number
    public static void main(String[] args)
    {
        int N = 10;
        int sum = 0;
        System.out.println("First " + N + " Numbers = ");

        //we initialize the value of the variable i
        //with 1 and increment each time with 1
        for (int i = 1; i <= N; i++) {

            //print the value of the variable as
            //long as the code executes

            System.out.println(i + " ");
            sum += i;
        }
        System.out.println();
        System.out.println("Sum of first " + N + " Natural Number = " + sum );


    }















}





