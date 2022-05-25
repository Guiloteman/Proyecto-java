package programa;

public class Socio extends Persona {
    private int numero;

    public Socio(int numero, String nombre, int dni, String domicilio, int telefono, int edad) {
        super(nombre, dni, domicilio, telefono, edad);
        this.numero = numero;
    }

    @Override
    public String toString() {
        return String.format("Numero: %d, Nombre: %s, Dni: %d, Edad: %d, Domicilio: %s, Telefono: %d",
                numero,
                getNombre(),
                getDni(),
                getEdad(),
                getDomicilio(),
                getTelefono());
    }
}
