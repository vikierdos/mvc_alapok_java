package app;

import controller.Controller;
import nezet.KonzolNezet;
import modell.Filmek;


public class MVC_Program {

    public static void main(String[] args) {
       Filmek filmek = new Filmek();
       KonzolNezet konzolnezet = new KonzolNezet();
       Controller controller = new Controller(filmek, konzolnezet);
    }
    
}
