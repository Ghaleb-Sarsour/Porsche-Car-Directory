import java.util.Scanner;

public class Car{

    public static void main(String[]args){
        CarDirectroy Car = new CarDirectroy();

        //Welcome Message
        System.out.println("Welcome to the Porsche Directory!");

        //Gathering User Input on Generation Choice
        Scanner CarGen = new Scanner(System.in);
        System.out.print("How Many Cars Do You Want To Generate?: ");
        int NumofCars = CarGen.nextInt();

        //For loop based off of number of cars chosen by user
        for(int i = 0; i < NumofCars; i++){


            //Getting Random Model
            Car.setRandModel();
            String Model = Car.getRandModel();

            //Getting Random Make
            Car.setRandMake(Model);
            String Make = Car.getRandMake();

            //Getting Random Trim
            Car.setRandTrim(Model, Make);
            String Trim = Car.getRandTrim();
            //Printing Car
            System.out.println("Porsche " + Model + " " + Make + " " + Trim);
        }
    }
}