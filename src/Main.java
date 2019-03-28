import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // Declaracion de lista

        List<Persona> personas = new ArrayList<Persona>();

        personas = Arrays.asList(new Persona("Santiago Carrizo", 21, 40546709),
                                new Persona("Juan Perez", 45, 25406001),
                                new Persona("Rodolfo Carrazco", 67, 10101010),
                                new Persona("Sergio Ramos", 25, 20902903),
                                new Persona("Pepe Giles", 15, 46001007));


        // Salida de información

        System.out.println("Listado de personas:");
        System.out.println(personas);

        System.out.println("\nPersonas mayores a 21:");
        System.out.println(personas.stream().filter(persona -> persona.getAge() > 21 )
                                            .collect(Collectors.toList()));

        System.out.println("\nPersonas menores a 18:");
        System.out.println(personas.stream().filter(persona -> persona.getAge() < 18 )
                                            .collect(Collectors.toList()));

        System.out.println("\nPersonas mayores a 21 y dni mayor a 20M:");
        System.out.println(personas.stream().filter(persona -> persona.getAge() > 21 )
                                            .filter(persona -> persona.getDni() > 20000000)
                                            .collect(Collectors.toList()));
    }
}
