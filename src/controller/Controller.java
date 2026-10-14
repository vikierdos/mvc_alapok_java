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
    }

    private void osszesfilmKiirasa() {
//        String uzenet = "\n\tÖsszes film:\n";
//        for (Film film : modell.getFilmek()) {
//            uzenet += film + "\n";
//        }
//        konzolnezet.megjelenit(uzenet);
        String uzenet = "";
        
        List<Film> filmek = modell.getFilmek();

        uzenet = filmek.toString();
        
        this.konzolnezet.megjelenit(uzenet);
        
    }
    
    
}
