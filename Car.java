public class Car{

    public static void main(String[]args){
        CarDirectroy Car = new CarDirectroy();

        //Getting Random Model
        Car.SetRandModel();
        String Model = Car.GetRandModel();
        System.out.println(Model);

        //Getting Random Make
        Car.SetRandMake(Model);
        String Make = Car.getRandMake();
        System.out.println(Make);
    }
    
}