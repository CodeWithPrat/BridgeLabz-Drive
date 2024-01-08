import java.util.Scanner;

public class CheckTheSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int monthNumber;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter a month number (1 to 12): ");

            // Check if the input is an integer
            if (scanner.hasNextInt()) {
                monthNumber = scanner.nextInt();

                // Check if the input is within the range of 1 to 12
                if (monthNumber >= 1 && monthNumber <= 12) {
                    validInput = true;

                    // Determine the season based on the month number
                    String season = getSeason(monthNumber);
                    System.out.println("The season for month " + monthNumber + " is: " + season);
                } else {
                    System.out.println("Invalid input! Month number should be between 1 and 12.");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid month number.");
                scanner.next(); // Discard the invalid input
            }
        }

        scanner.close();
    }

    public static String getSeason(int month) {
        // Determine the season based on the month number
        String season;
        switch (month) {
            case 2:
            case 3:
                season = "Vasanta";
                break;
            case 4:
            case 5:
                season = "Grishma / Summer";
                break;
            case 6:
            case 7:
                season = "Monsoon / Rainy";
                break;
            case 8:
            case 9:
                season = "Sharada";
                break;
            case 10:
            case 11:
                season = "Hemanta";
                break;
            case 12:
            case 1:
                season = "Shishira / Winter";
                break;
            default:
                season = "Unknown";
        }
        return season;
    }
}
