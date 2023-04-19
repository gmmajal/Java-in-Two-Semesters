import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        char request;
        double temperature;
        do{
            displayMenu();
            Scanner keyboard = new Scanner(System.in);
            request = keyboard.next().charAt(0);
            switch (request){
                case '1':
                        System.out.println("Please enter a temperature value in Celsius: ");
                        temperature = keyboard.nextDouble();
                        temperature = checkTempCelsius(temperature);
                        double f = CtoF(temperature);
                        System.out.println("The value in Fahrenheit is " + f + " F ");
                        break;
                case '2':
                    System.out.println("Please enter a temperature value in Fahrenheit: ");
                    temperature = keyboard.nextDouble();
                    temperature = checkTempFahrenheit(temperature);
                    double c = FtoC(temperature);
                    System.out.println("The value in Celsius is " + c + " C ");
                    break;
                case '3':
                    System.out.println("Quitting!");
                    break;
                default:
                    System.out.println("Please select an option between [1-3]!");
                    break;
            }
        }while(request !='3');
    }

    public static void displayMenu(){
        System.out.println();
        System.out.println("Select one of the following options [1-3]");
        System.out.println("[1] Enter temperature in Celsius and have it converted to Fahrenheit.");
        System.out.println("[2] Enter temperature in Fahrenheit and have it converted to Celsius.");
        System.out.println("[3] Quit.");
    }

    public static double checkTempFahrenheit(double temp){
        if(temp > -459.67){
            return temp;
        }
        else{
            while(temp < -459.67){
                System.out.println("Please enter a temperature in Fahrenheit above absolute zero(-459.67F)!");
                Scanner keyboard = new Scanner(System.in);
                temp = keyboard.nextDouble();
            }
            return temp;
        }
    }

    public static double checkTempCelsius(double temp){
        if(temp > -273.15){
            return temp;
        }
        else{
            while(temp < -273.15){
                System.out.println("Please enter a temperature in Celsius above absolute zero(-273.15C)!");
                Scanner keyboard = new Scanner(System.in);
                temp = keyboard.nextDouble();
            }
            return temp;
        }
    }
    public static double CtoF(double temp){
        double temp_f = ( (9.0 * temp) / 5.0) + 32;
        return temp_f;
    }

    public static double FtoC(double temp){
        double temp_c = ( 5.0 * (temp - 32)) / 9.0;
        return temp_c;
    }
}