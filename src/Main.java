import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String monthName = "";
        int birthMonth = 0;

        System.out.println("As a number, what is your birth month?");
        if (scanner.hasNextInt()) {
            birthMonth = scanner.nextInt();

            if (birthMonth < 1 || birthMonth > 12) {
                exit(birthMonth);
            }

            switch (birthMonth) {
                case 1:
                    monthName = "January";
                    break;
                case 2:
                    monthName = "February";
                    break;
                case 3:
                    monthName = "March";
                    break;
                case 4:
                    monthName = "April";
                    break;
                case 5:
                    monthName = "May";
                    break;
                case 6:
                    monthName = "June";
                    break;
                case 7:
                    monthName = "July";
                    break;
                case 8:
                    monthName = "August";
                    break;
                case 9:
                    monthName = "September";
                    break;
                case 10:
                    monthName = "October";
                    break;
                case 11:
                    monthName = "November";
                    break;
                case 12:
                    monthName = "December";
                    break;
            }
            System.out.println("Your birth month is " + monthName + "!");
        } else {
            exit(birthMonth);
        }
    }

    // (function exists due to DRY principal)
    public static void exit(int month) {
        System.out.println("You entered an incorrect month value: " + month);
        System.exit(0);
    }
}