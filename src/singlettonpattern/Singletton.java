package singlettonpattern;



public class Singletton {

public static Singletton instance = new Singletton() ;

    public Singletton() {
    }

    public static Singletton geSingletton(){
        return instance;
    }
    
    public void showMessage(){
        System.out.println("HARDWAREANDRO.COM");
    }


    
}
