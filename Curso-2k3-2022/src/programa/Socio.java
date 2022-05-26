package programa;

public class Socio extends Persona{
  private int nroSocio;

    public Socio(int nroSocio, String nombre, int dni, String domicilio, int telefono, int edad) {
        super(nombre, dni, domicilio, telefono, edad);
        this.nroSocio = nroSocio;
        mostrar();
    }

    public void mostrar(){
        System.out.println("Numero de socio: " + nroSocio + "\tNombre: " + getNombre() + "\tNumero de DNI: " + getDni() + "\tDomicilio: " + getDomicilio() + "\tNumero de Telefono: " + getTelefono());
    }

}
