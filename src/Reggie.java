import java.util.Scanner;
public class Reggie {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String SSN = SafeInput.getRegExString(in,"Enter your SSN", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your SSN is " + SSN);

        String UC = SafeInput.getRegExString(in, "Enter your UC Student number", "(M|m)\\d{5}");
        System.out.println("Your UC Number is " + UC);

        String menu = SafeInput.getRegExString(in, "What is your choice", "[OoSsVvQq]");
        System.out.println("Your menu choice is " + menu);
    }
}