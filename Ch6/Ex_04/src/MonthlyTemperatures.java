import java.util.Scanner;

public class MonthlyTemperatures {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char choice;
        double[][] temperature = new double[4][7];
        do {
            System.out.println();
            System.out.println("[1] Enter temperatures");
            System.out.println("[2] Display all");
            System.out.println("[3] Display one week");
            System.out.println("[4] Display day of the week");
            System.out.println("[5] Display the max temperature");
            System.out.println("[6] Exit");
            System.out.print("Enter choice [1-6]: ");
            choice = keyboard.next().charAt(0);
            System.out.println();

            switch (choice) {
                case '1':
                    enterTemps(temperature);
                    break;
                case '2':
                    displayAllTemps(temperature);
                    break;
                case '3':
                    displayWeek(temperature);
                    break;
                case '4':
                    displayDays(temperature);
                    break;
                case'5':
                    double mTemp = max(temperature);
                    break;
                case '6':
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("ERROR: options 1-6 only!");
                    break;
            }
        } while (choice != '6');
    }

    static void enterTemps(double[][] temperatureIn) {
        Scanner keyboard = new Scanner(System.in);
        for (int week = 1; week <= temperatureIn.length; week++) {
            for (int day = 1; day <= temperatureIn[0].length; day++) {
                System.out.println("enter temperature for week " + week + " and day " + day);
                temperatureIn[week - 1][day - 1] = keyboard.nextDouble();
            }
        }
    }

    static void displayAllTemps(double[][] temperatureIn) {
        System.out.println();
        System.out.println("***TEMPERATURES ENTERED***");
        for (int week = 1; week <= temperatureIn.length; week++) {
            for (int day = 1; day <= temperatureIn[0].length; day++) {
                System.out.println("week " + week + " day " + day + ": " + temperatureIn[week - 1][day - 1]);
            }
        }
    }

    static void displayWeek(double[][] temperatureIn) {
        Scanner keyboard = new Scanner(System.in);
        int week;
        System.out.print("Enter week number (1-4): ");
        week = keyboard.nextInt();
        while (week < 1 || week > 4) {
            System.out.println("Invalid week number!!");
            System.out.print("Enter again (1-4 only): ");
            week = keyboard.nextInt();
        }

        System.out.println();
        System.out.println("***TEMPERATURES ENTERED FOR WEEK " + week + "***");
        System.out.println();

        for (int day = 1; day <= temperatureIn[0].length; day++) {
            System.out.println("week " + week + " day " + day + ": " + temperatureIn[week - 1][day - 1]);
        }
    }

    static void displayDays(double[][] temperatureIn) {

        Scanner keyboard = new Scanner(System.in);
        int day;

        System.out.print("Enter day number (1-7): ");
        day = keyboard.nextInt();

        while (day < 1 || day > 7) {
            System.out.println("Inavlid day number!!");
            System.out.print("Enter again (1-7 only): ");
            day = keyboard.nextInt();
        }

        System.out.println();
        System.out.println("***TEMPERATURES ENTERED FOR DAY " + day + "***");
        System.out.println();

        for (int week = 1; week <= temperatureIn.length; week++) {
            System.out.println("week " + week + " day " + day + ": " + temperatureIn[week - 1][day - 1]);
        }
    }
    static double max(double [][] temperatureIn){
        double maximumVal = temperatureIn[0][0];
        for(int i = 0; i < temperatureIn.length; ++i){
            for(int j = 0; j < temperatureIn[0].length; ++j){
                if(temperatureIn[i][j]> maximumVal){
                    maximumVal = temperatureIn[i][j];
                }
            }
        }
        System.out.println(" The maximum temperature is " + maximumVal);
        return maximumVal;
    }
}