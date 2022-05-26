package programa;

import java.util.ArrayList;

public class Club {
  private String nom;
  private ArrayList<Socio> socios= new ArrayList<>();

    public Club(String nom) {
        this.nom = nom;
    }

void agregarSocio(Socio socio){
  socios.add(socio);
}

    
}
