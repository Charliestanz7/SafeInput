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
    /**
     * A method that prompts for and returns an integer
     * @param pipe the Scanner to use for input
     * @param prompt the prompt to display to the user
     * @return any integer value
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        int retInt = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt())
            {
                retInt = pipe.nextInt();
                pipe.nextLine(); //clear the buffer
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("\n" + trash + " is not a valid integer");
            }
        } while (!done);

        return retInt;
    }
    /**
     * A method that prompts for and returns a double value
     * @param pipe the Scanner to use for input
     * @param prompt the prompt to display to the user
     * @return any double value
     */
    public static double getDouble(Scanner pipe, String prompt)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine(); //clear the buffer
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("\n" + trash + " is not a valid double");
            }
        } while (!done);

        return retVal;
    }
    /**
     * A method that prompts for and returns an integer
     * @param pipe the Scanner to use for input
     * @param prompt the prompt to display to the user
     * @param low the lowest acceptable integer
     * @param high the highest acceptable integer
     * @return any integer value
     */
    public static int getRangedInt (Scanner pipe, String prompt, int low, int high)
    {
        int retInt = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt +" [" + low + "-" + high + "]: ");
            if (pipe.hasNextInt()) {
                retInt = pipe.nextInt();
                pipe.nextLine(); //clear the buffer
                if (retInt >= low && retInt <= high) {
                    done = true;
                } else {
                    System.out.println("\n" + retInt + " is not in range [" + low + " - " + high + "]");
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("\n" + trash + " is not a valid integer");
            }
        } while (!done);

        return retInt;
    }
    /**
     * A method that prompts for and returns an double
     * @param pipe the Scanner to use for input
     * @param prompt the prompt to display to the user
     * @param low the lowest acceptable double
     * @param high the highest acceptable double
     * @return any integer value
     */
    public static double getRangedDouble (Scanner pipe, String prompt, double low, double high)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt +" [" + low + "-" + high + "]: ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine(); //clear the buffer
                if (retVal >= low && retVal <= high) {
                    done = true;
                } else {
                    System.out.println("\n" + retVal + " is not in range [" + low + " - " + high + "]");
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("\n" + trash + " is not a valid integer");
            }
        } while (!done);

        return retVal;
    }
    /**
     * A method that prompts for and returns a boolean response for Y/N
     * @param pipe the Scanner to use for input
     * @param prompt the prompt to display to the user
     * @return true for Y or false for N
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        String response = "";
        boolean retVal = false;
        boolean done = false;

        do {
            System.out.print("\n" + prompt + " [Y/N]: ");
            response = pipe.nextLine().trim().toUpperCase();
            if (response.equalsIgnoreCase("Y"))
            {
                retVal = true;
                done = true;
            }
            else if (response.equalsIgnoreCase("N"))
            {
                retVal = false;
                done = true;
            }
            else
            {
                System.out.println("\n" + response + " is not a valid response. Please enter Y or N.");
            }
        } while (!done);

        return retVal;
    }
    /**
     * A method that prompts for and returns a string that matches the provided regular expression
     * @param pipe the Scanner to use for input
     * @param prompt the prompt to display to the user that includes the regex pattern
     * @param regEx the regular expression the input must match
     * @return a string that matches the provided regular expression
     */
    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        String retString = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt + "[" + regEx + "]: ");
            retString = pipe.nextLine();

            if (retString.matches(regEx))
            {
                done = true;
            }
            else
            {
                System.out.println("\n" + retString + " does not match the required format.");
            }
        } while (!done);

        return retString;
    }
    public static void prettyHeader(String msg) {
        final int WIDTH = 60;  // total width of the header

        // Print the top border of stars
        for (int i = 0; i < WIDTH; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Print the middle line with the message centered
        System.out.print("***");  // 3 stars at the start
        int totalSpaces = WIDTH - 6 - msg.length(); // 6 stars total (3 on each side)
        int leftSpaces = totalSpaces / 2;
        int rightSpaces = totalSpaces - leftSpaces;

        for (int i = 0; i < leftSpaces; i++) {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < rightSpaces; i++) {
            System.out.print(" ");
        }
        System.out.println("***");  // 3 stars at the end

        // Print the bottom border of stars
        for (int i = 0; i < WIDTH; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}





