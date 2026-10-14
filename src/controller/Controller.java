package controller;

import java.util.List;
import modell.Film;
import modell.Filmek;
import nezet.KonzolNezet;

public class Controller {
    private Filmek modell;
    private KonzolNezet konzolnezet;

    public Controller(Filmek modell, KonzolNezet konzolnezet) {
        this.modell = modell;
        this.konzolnezet = konzolnezet;
        String uzenet = "";
        
//        for (Film film : this.filmek.getFilmek()) {
//            uzenet += film + "\n";
//        }
        List<Film> filmek = modell.getFilmek();

        uzenet = filmek.toString();
        
        this.konzolnezet.megjelenit(uzenet);
    }
    
    
}
