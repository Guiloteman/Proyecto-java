package programa;

import java.util.ArrayList;

public class Club {
    private String nombre;

    private ArrayList<Socio> socios = new ArrayList<>();

    public Club(String nombre) {
        this.nombre = nombre;
    }

    void agregarSocio(Socio socio) {
        socios.add(socio);
    }


}
