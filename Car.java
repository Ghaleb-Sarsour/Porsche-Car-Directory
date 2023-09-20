public class Car{

    public static void main(String[]args){
        CarDirectroy Car = new CarDirectroy();

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
        System.out.print("Porsche " + Model + " " + Make + " " + Trim);
    }
    
}