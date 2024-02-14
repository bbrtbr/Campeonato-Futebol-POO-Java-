import java.util.ArrayList;
import java.util.List;

import TrabalhoPOO.Campeonato;
import TrabalhoPOO.Clube;

public class Teste {
 public static void main(String[] args) {
       	
		Clube c1 = new Clube("Liverpool");
		Clube c2 = new Clube("Manchester City");
		Clube c3 = new Clube("Tottenham");
		Clube c4 = new Clube("Wolverhamptom");
		Clube c5 = new Clube("Luton Town");
		Clube c6 = new Clube("Chelsea");
		
		List<Clube> clubes = new ArrayList<>();
		clubes.add(c1);
		clubes.add(c2);
		clubes.add(c3);
		clubes.add(c4);
		clubes.add(c5);
		clubes.add(c6);
		
		Campeonato campeonato = new Campeonato(clubes);
		campeonato.jogarCampeonato();
		
		campeonato.setClassificacao();
		campeonato.setCampeao();
    }
}
