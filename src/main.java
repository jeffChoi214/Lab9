import java.util.Scanner;

/*
 * Lab 9 by Jeff Choi 2/6/2017
*/

public class main {
    public static int getCars(Scanner sc, Validator validate) {
        System.out.println("Welcome to the Grand Circus Motors admin console!");
        System.out.print("How many cars are you entering: ");
        //numCars = sc.nextInt();
        //sc.nextLine();
        int numCars = validate.getInt(sc);
        return numCars;
    }

    public static void getInput(Car[] cars, int numCars, Scanner sc, Validator validate) {
        for (int i = 0; i < numCars; i++) {
            String make, model, holder;
            int year;
            double price;

            System.out.print("Enter Car#" + i + " Make: " );
            make = validate.getString(sc);
            System.out.print("Enter Car#" + i + " Model: ");
            model = validate.getString(sc);
            System.out.print("Enter Car#" + i + " Year: ");
            year = validate.getInt(sc);
            System.out.print("Enter Car#" + i + " Price: ");
            price = validate.getDouble(sc);
            cars[i] = new Car(make, model, year, price);
        }
    }

    public static void printOutput(Car[] cars, int numCars) {
        System.out.println("");
        System.out.println("Current Inventory:");

        for (int j = 0; j < numCars; j++) {
            cars[j].printString();
        }
    }

    public static void main (String[] args) {
        Validator validate = new Validator();
        Scanner sc = new Scanner(System.in);
        int numCars = getCars(sc, validate);

        Car[] cars = new Car[numCars];
        getInput(cars, numCars, sc, validate);
        printOutput(cars, numCars);
    }
}
