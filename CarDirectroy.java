import java.util.Random;

public class CarDirectroy {

    //Var for Make and Model of Generated Car (Macan Has Only One Model And Blank Is For Default)
    String CarMake = "";
    String CarModel = "";
    String CarTrim = "";

    //Models
    String[] Models = {"718", "911", "Taycan", "Panamera", "Macan", "Cayenne"};


    //718 Makes
    String[] Makes718 = {"Cayman", "Boxter", "GT4 RS", "Spyder RS"};

    //911 Makes
    String[] Makes911 = {"Carrera", "Targa", "Turbo", "Dakar", "GT3", "GT3 RS", "S/T"};

    //Cayenne Makes
    String[] MakesCayenne = {"", "Coupe"};


    //718 Trims
    String[] TrimsCayman718 = {"", "Style Edition", "S", "GTS 4.0"};
    String[] TrimsBoxter718 = {"", "Style Edition", "S", "GTS 4.0"};

    //911 Trims
    String[] TrimsCarrera911 = {"", "T", "Cabriolet", "4", "4 Cabriolet", "S", "S Cabriolet", "4S", "4S Cabriolet", "GTS", "GTS Cabriolet"};
    String[] TrimsTarga911 = {"", "4", "4S", "4 GTS", "911 Edition 50 Years Porsche Design"};
    String[] TrimsTurbo911 = {"", "Cabriolet", "S", "S Cabriolet"};
    String[] TrimsGT3911 = {"", "Touring Package"};

    //Taycan Trims
    String[] TrimsTaycan = {"", "4 Cross Turismo", "4S", "4S Cross Turismo", "GTS", "GTS Sport Turismo", "Turbo", "Turbo Cross Turismo", "Turbo S", "Turbo S Cross Turismo"};

    //Panamera Trims
    String[] TrimsPanamera = {"", "Platinum Edition", "4", "4 Platinum Edition", "4 Executive", "4 Sport Turismo", "4S", "4S Executive", "4S Sport Turismo", "4 E-Hybrid", "4 E-Hybrid Platinum Edition", "4 E-Hybrid Executive", "4 E-Hybrid Sport Turismo", "4S E-Hybrid", "4S E-Hybrid Executive", "4S E-Hybrid Sport Turismo", "GTS", "GTS Sport Turismo", "Turbo S", "Turbo S Executive", "Turbo S Sport Turismo", "Turbo S E-Hybrid", "Turbo S E-Hybrid Executive", "Turbo S E-Hybrid Sport Turismo"};

    //Macan Trims
    String[] TrimsMacan = {"", "T", "S", "GTS"};

    //Cayenne Trims
    String[] TrimsCayenne = {"", "E-Hybrid", "S", "Turbo E-Hybrid"};
    String[] TrimsCoupeCayenne = {"", "E-Hybrid", "S", "Turbo E-Hybrid Coupe", "Turbo GT"};

    //Constuctor
    public CarDirectroy(){
    }

    //Setting the Random Model
    public void setRandModel(){
        Random random = new Random();
        CarMake = Models[random.nextInt(Models.length)];

    }

    //Getting the Random Model
    public String getRandModel(){
        return CarMake;
    }

    //Setting the Random Make
    public void setRandMake(String CurrentModel){

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
        
        //Setting Make If Model is Cayenne
        else if(CurrentModel.equals("Cayenne")){
            Random Cayenne = new Random();
            CarModel = MakesCayenne[Cayenne.nextInt(MakesCayenne.length)];
        }

        //Other Models
        else{
            CarModel = "";
        }
        
    }

    //Getting The Random Make
    public String getRandMake(){
        return CarModel;
    }

    //Setting The Random Trim If Model is 718
    public void setRandTrim(String CurrentModel, String CurrentMake){
        //Setting the Trim if Model is 718
        if (CurrentModel.equals("718")){

            //Cayman Trims
            if (CurrentMake.equals("Cayman")){
                Random Seven18T = new Random();
                CarTrim = TrimsCayman718[Seven18T.nextInt(TrimsCayman718.length)];
            }
            //Boxter Trims
            else if (CurrentMake.equals("Boxter")){
                Random Seven18T2 = new Random();
                CarTrim = TrimsBoxter718[Seven18T2.nextInt(TrimsBoxter718.length)];
            }
            //Other Trims
            else{
                CarTrim = "";
            }

        }
        //Setting the Trim if Model is 911
        else if (CurrentModel.equals("911")){
            
            //Carrera Trims
            if (CurrentMake.equals("Carrera")){
                Random Nine11T = new Random();
                CarTrim = TrimsCarrera911[Nine11T.nextInt(TrimsCarrera911.length)];
            }
            //Targa Trims
            else if (CurrentMake.equals("Targa")){
                Random Nine11T2 = new Random();
                CarTrim = TrimsTarga911[Nine11T2.nextInt(TrimsTarga911.length)];
            }
            //Turbo Trims
            else if (CurrentMake.equals("Turbo")){
                Random Nine11T3 = new Random();
                CarTrim = TrimsTurbo911[Nine11T3.nextInt(TrimsTurbo911.length)];
            }
            //GT3 Trims
            else if (CurrentMake.equals("GT3")){
                Random Nine11T4 = new Random();
                CarTrim = TrimsGT3911[Nine11T4.nextInt(TrimsGT3911.length)];
            }
            //Other Trims
            else{
                CarTrim = "";
            }
        }
        //Setting the Trim if Model is Taycan
        else if (CurrentModel.equals("Taycan")){
            Random TaycanT = new Random();
            CarTrim = TrimsTaycan[TaycanT.nextInt(TrimsTaycan.length)];
        }
        //Setting the Trim if Model is Panamera
        else if (CurrentModel.equals("Panamera")){
            Random PanameraT = new Random();
            CarTrim = TrimsPanamera[PanameraT.nextInt(TrimsPanamera.length)];
        }
        //Setting the Trim if Model is Macan
        else if (CurrentModel.equals("Macan")){
            Random MacanT = new Random();
            CarTrim = TrimsMacan[MacanT.nextInt(TrimsMacan.length)];
        }
        //Setting the Trim if Model is Cayenne
        else if (CurrentModel.equals("Cayenne")){
            
            //Cayenne Trim
            if (CurrentMake.equals("")){
                Random CayenneT = new Random();
                CarTrim = TrimsCayenne[CayenneT.nextInt(TrimsCayenne.length)];
            }
            else if (CurrentMake.equals("Coupe")){
                Random CayenneT2 = new Random();
                CarTrim = TrimsCoupeCayenne[CayenneT2.nextInt(TrimsCoupeCayenne.length)];
            }
        }
    }

    //Getting Random Trim
    public String getRandTrim(){
        return CarTrim;
    }
}


