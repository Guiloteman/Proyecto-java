package programa;

public class Persona {
  private String nombre;
  private int dni;
  private String domicilio;
  private int telefono;
  private int edad;

    public Persona(String nombre, int dni, String domicilio, int telefono, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString(){
      return "Nombre: " + this.nombre + "\tNumero de DNI: " + this.dni + "\tDomicilio: " + this.domicilio + "\tNumero de Telefono: " + this.telefono + "\tEdad: " + this.edad;
}

}
