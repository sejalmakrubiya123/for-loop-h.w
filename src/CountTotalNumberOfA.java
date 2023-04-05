public class CountTotalNumberOfA {

    public static void main(String[] args) {
        //declare a string

        String string = "How many days";
        //initialize the string

        //declare a variable to count the total number of characters in the given string and initialize it to 0
        int count = 0;


        //count the characters in the string except space
        System.out.println("The entered string is : "+ string);

        //use a for loop to calculate the same.

        for (int i = 0; i < string.length(); i++)
        {
        //use an if condition to avoid counting space.
            if(string.charAt(i) != ' ')

         //increment the count each time a character encounters.
                count++;
        }
        //displays the total number of characters in the string
        System.out.println("Total number of 'a' in that string : " + count);
    }
}
