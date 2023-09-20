import java.util.Random;

public class CarDirectroy {

    //Var for Make and Model of Generated Car (Macan Has Only One Model)
    String CarMake = "";
    String CarModel = "";

    //Models
    String[] Models = {"718", "911", "Taycan", "Panamera", "Macan", "Cayenne"};

    //Makes
    String[] Makes718 = {"Cayman", "Boxter", "GT4 RS", "Spyder RS"};
    String[] Makes911 = {"Carrera", "Carrera Cabriolet", "Targa", "Turbo", "Turbo Cabriolet", "Dakar", "GT3", "GT3 RS", "S/T"};
    String[] MakesTaycan = {"Taycan", "Cross Turismo", "Sport Turismo"};
    String[] MakesPanamera = {"Panamera", "Sport Turismo", "Executive"};
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

    //Setting the Random Make
    public void SetRandMake(String CurrentModel){

        //Setting Make If Model is 718
        if(CurrentModel.equals("718")){
            Random Seven18 = new Random();
            CarModel = Makes718[Seven18.nextInt(Makes718.length)];
        }

        //Setting Make If Model is 911
        else if(CurrentModel.equals("911")){
            Random Nine11 = new Random();
            CarModel = Makes911[Nine11.nextInt(Makes911.length)];
        }

        //Setting Make If Model is Taycan
        else if(CurrentModel.equals("Taycan")){
            Random Taycan = new Random();
            CarModel = MakesTaycan[Taycan.nextInt(MakesTaycan.length)];
        }
    
        //Setting Make If Model is Panamera
        else if(CurrentModel.equals("Panamera")){
            Random Panamera = new Random();
            CarModel = MakesPanamera[Panamera.nextInt(MakesPanamera.length)];
        }
        
        //Setting Make If Model is Cayenne
        else if(CurrentModel.equals("Cayenne")){
            Random Cayenne = new Random();
            CarModel = MakesCayenne[Cayenne.nextInt(MakesCayenne.length)];
        }

        else{
            CarModel = "";
        }
        
    }

    //Getting The Random Make
    public String getRandMake(){
        return CarModel;
    }
}


