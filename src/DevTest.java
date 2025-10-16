import java.util.Scanner;

public class DevTest {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //test for getNonZeroLenString

        String name = getNonZeroLenString(in, "Enter your name");
        System.out.println("Hello " + name);


    }
    //code for the methods goes here to be tested
    //then is copied or moved to safeinput

    /**
     * A method that prompts for and returns a string response with at least one character
     * @param pipe the Scanner to use for input
     * @param prompt the prompt to display to the user
     * @return
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = " ";

        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();

            if (retString.isEmpty())
            {
                System.out.println("\nYou must enter at least one character");
            }
        } while (retString.isEmpty());

        return retString;
    }
}