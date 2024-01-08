import java.util.Calendar;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner myAge = new Scanner(System.in);

        // Get birth year from user and assign it
        System.out.println("Enter Your birth year: ");
        int birthYear = myAge.nextInt();

        System.out.println("Enter Your birth month: ");
        int birthMonth = myAge.nextInt();

        System.out.println("Enter Your birthday: ");
        int birthDay = myAge.nextInt();

        Calendar currentDate = Calendar.getInstance(); // Get current date

        // Set calender
        Calendar birthCalendar = Calendar.getInstance();
        birthCalendar.set(birthYear, birthMonth - 1, birthDay);

        int age = currentDate.get(Calendar.YEAR) - birthCalendar.get(Calendar.YEAR); // Calculate the age
        if (currentDate.get(Calendar.DAY_OF_YEAR) < birthCalendar.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }
        System.out.println("Your age is:  " + age);

        myAge.close();

    }
}
