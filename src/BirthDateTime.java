import java.util.Scanner;
    public class BirthDateTime {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String birthDay = " ";
        String birthYear = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015) + "";
        String birthMonth = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12) + "";
        switch (birthMonth) {
            case "1", "3", "5", "7", "8", "10", "12" -> {
                //31 days
                birthDay = SafeInput.getRangedInt(in, "Enter your birth day", 1, 31) + "";
            }
            case "4", "6", "9", "11" -> {
                //30 days
                birthDay = SafeInput.getRangedInt(in, "Enter your birth day", 1, 30) + "";
            }
            case "2" -> {
                //28 days
                birthDay = SafeInput.getRangedInt(in, "Enter your birth day", 1, 28) + "";
            }
            default -> {
                //should never happen
            }
        }
        String birthHour = SafeInput.getRangedInt(in, "Enter your birth hour", 0, 23) + "";
        String birthMinute = SafeInput.getRangedInt(in, "Enter your birth minute", 0, 59) + "";
        System.out.println("\nYour birth date and time is: " + birthMonth + "/" + birthDay + "/" + birthYear + " " + birthHour + ":" + birthMinute);
    }
}