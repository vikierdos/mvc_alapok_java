package controller;

import modell.Film;
import modell.Filmek;
import nezet.KonzolNezet;

public class Controller {
    private Filmek filmek;
    private KonzolNezet konzolnezet;

    public Controller(Filmek filmek, KonzolNezet konzolnezet) {
        this.filmek = filmek;
        this.konzolnezet = konzolnezet;
        String uzenet = "";
        
        for (Film film : this.filmek.getFilmek()) {
            uzenet += film + "\n";
        }
        
        this.konzolnezet.megjelenit(uzenet);
    }
    
    
}
