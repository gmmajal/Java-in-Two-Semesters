public class DisplayEvenOneToTwenty {
    public static void main(String[] args) {

        System.out.println("*** Even numbers from 1 to 20 ***");
        System.out.println();
        for(int i=1; i <= 20; ++i) // loop through the numbers 1 to 20
        {
            // body of the loop contains in ‘if’ statement
            if (i%2 == 0) // check if number is even
            {
                System.out.println(i); // number displayed only when it is checked to be even
            }
        }

    }
}