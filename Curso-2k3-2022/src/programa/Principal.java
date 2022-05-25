package programa;


public class Principal {


    public static void main(String[] args) {

        Club miclub = new Club("Natacion y Gimnasia");

        Socio socio1 = new Socio(
                1,
                "Martin",
                45963852,
                "Laprida 123",
                381123456,
                15
        );

        System.out.println(socio1);

        miclub.agregarSocio(socio1);
    }

}
