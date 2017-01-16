package singlettonpattern;

import singlettonpattern.Singletton.*;
public class SinglettonPattern {

    public static void main(String[] args) {
       
        
        Singletton object = Singletton.geSingletton();
        object.showMessage();
    }
    
}
