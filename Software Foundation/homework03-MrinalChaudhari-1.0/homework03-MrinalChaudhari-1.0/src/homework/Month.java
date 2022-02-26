/**
 Write a method that, given a String
 that is a date in the format of YYYY/MM/DD , returns a string in the format “Month
 Day, Year” . For example, given the String “2019/09/03” the method will
 return the String “September 3rd, 2019” .
 */


package homework;
import java.util.Scanner;
public class Month {

    /**
     * *
     * @param args In main class, date is entered by user in correct format.
     */
    public static void main(String[] args) {
        String date = "";
        System.out.println("Enter a valid date in the format YYYY/MM/DD");
        Scanner input = new Scanner(System.in);
        date = input.nextLine();
        String Output = splitDate(date);
        System.out.println(Output);
    }

    /**
     * *
     * @param splitDate methods is used to split date into month, and year to process separately.
     * @return it returns month and day with suffix form next method and year.
     */
    public static String splitDate(String date)
    {
        String month = "", day = "";
        String[] dateSplit = date.split("/");
        int years = Integer.parseInt(dateSplit[0]);
        int months = Integer.parseInt(dateSplit[1]);
        int days = Integer.parseInt(dateSplit[2]);
        month = getMonth(months);
        day = SuffixDays(days);
        return month + " " + days+ "" + day +"," + years;
    }

    /**
     *
     * @param m returns value of correct month
     * @return value of month using switch cases.
     */
    public static String getMonth(int m) {

        if (m <= 0 || m > 12) {
            System.out.println("Invalid month");
            return "";
        }
        switch (m) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid month";
        }
    }

    /**
     *
     * @param day checks if the given date is between 1 to 31
     * @return the value of day suffix
     */
    public static String SuffixDays(int day) {

        String suffix = "";
        if (day < 0 || day > 31) {
            System.out.println("Invalid day");
        }
        if (day > 0 && day <= 31) {
            int i = day % 10;
            int j = day % 100;
            if (i == 1 && j != 11)
                suffix = "st";
            else if (i == 2 && j != 12)
                suffix = "nd";
            else if (i == 3 && j != 13)
                suffix = "rd";
            else
                suffix = "th";
        }
        return suffix;
    }
}
// end of class printTheDate