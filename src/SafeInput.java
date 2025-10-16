import java.util.Scanner;

public class SafeInput
{
    //static methods definitions go here
    //are called with SafeInput.METHODNAME




    /**
     * A method that prompts for and returns a string response with at least one character
     * @param pipe the Scanner to use for input
     * @param prompt the prompt to display to the user
     * @return a non-empty string
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





