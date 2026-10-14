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
        
        osszesfilmKiirasa();
        legtobbPontuFilm();
    }

    public void osszesfilmKiirasa() {
        String uzenet = "\n\tÖsszes film:\n";
        for (Film film : modell.getFilmek()) {
            uzenet += film + "\n";
        }
        konzolnezet.megjelenit(uzenet);
//        String uzenet = "";
//        
//        List<Film> filmek = modell.getFilmek();
//
//        uzenet = filmek.toString();
//        
//        this.konzolnezet.megjelenit(uzenet);
        
    }
    
    public void legtobbPontuFilm(){
        List<Film> filmek = modell.getFilmek();
        int legtobbPontuIndex = 0;
        for (int i = 0; i < filmek.size(); i++) {
            if(filmek.get(i).getPont() > filmek.get(legtobbPontuIndex).getPont()){
                legtobbPontuIndex = i;
            }
        }
        String uzenet = "A legtöbb pontú film címe: " + filmek.get(legtobbPontuIndex).getCim();
        
        konzolnezet.megjelenit(uzenet);
    }
    
    
}
