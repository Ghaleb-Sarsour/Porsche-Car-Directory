public class Car{

    public static void main(String[]args){
        CarDirectroy Car = new CarDirectroy();

        Car.SetRandModel();
        String Make = Car.GetRandModel();
        System.out.println(Make);
    }
    
}