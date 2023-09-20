import java.util.Random;

public class CarDirectroy {

    //Var for Make and Model of Generated Car
    String CarMake = "";
    String CarModel = "";

    String[] Models = {"718", "911", "Taycan", "Panamera", "Macan", "Cayenne"};
    String[] Makes718 = {"Cayman", "Boxter", "GT4 RS", "Spyder RS"};
    String[] Makes911 = {"Carrera", "Carrera Cabriolet", "Targa", "Turbo", "Turbo Cabriolet", "Dakar", "GT3", "GT3 RS", "S/T"};
    String[] MakesTaycan = {"Taycan", "Cross Turismo", "Sport Turismo"};
    String[] MakesPanamera = {"Panamera", "Sport Turismo", "Executive"};
    String[] MakesMacan = {"Macan"};
    String[] MakesCayenne = {"Cayenne", "Cayenne Coupe"};

    //Constuctor
    public CarDirectroy(){
        String CarMake;
        String CarModel;
    }

    //Setting the Random Model
    public void SetRandModel(){
        Random random = new Random();
        CarMake = Models[random.nextInt(Models.length)];

    }

    //Getting the Random Model
    public String GetRandModel(){
        return CarMake;
    }
}


