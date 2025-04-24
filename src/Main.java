// Estudiante: Ariel Macias
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Crear el scanner para ingresar datos
        Scanner sc = new Scanner(System.in);

        // OBJETOS
        // Jugadores con los datos quemados
        Jugador j1 = new Jugador("Fernando Pérez","Delantero",26,14);
        Jugador j2 = new Jugador("Juan Pablo","Lateral",20,11);

        // Jugador con datos de entrada
        System.out.print("Ingrese el nombre del jugador: ");
        String nombre_j3 = sc.nextLine();

        System.out.print("Ingrese la posición del jugador: ");
        String posicion_j3 = sc.nextLine();

        System.out.print("Ingrese la edad del jugador: ");
        int edad_j3 = sc.nextInt();

        System.out.print("Ingrese el número de camiseta del jugador: ");
        int n_camiseta_j3 = sc.nextInt();
        sc.nextLine();  // Consume la línea restante

        //Se crea el jugador con lo datos de entrada
        Jugador j3 = new Jugador(nombre_j3,posicion_j3,edad_j3,n_camiseta_j3);

        sc.close();

        //Mostrar la información de los jugadores
        j1.mostrarInformacion();
        j2.mostrarInformacion();
        j3.mostrarInformacion();

    }
}