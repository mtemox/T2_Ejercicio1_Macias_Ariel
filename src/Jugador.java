// Estudiante: Ariel Macias
// Crear una clase para el jugador
public class Jugador {
    // Atributos de la clase
    String nombre;
    String posicion;
    int edad;
    int n_camiseta;

    // Constructor
    public Jugador(String nombre, String posicion, int edad, int n_camiseta){
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
        this.n_camiseta = n_camiseta;
    }

    // Metodo para mostrar la informacion de un jugador
    public void mostrarInformacion(){
        System.out.println("\nInformación del Jugador:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Posición: " + posicion);
        System.out.println("Número de camiseta: " + n_camiseta);
    }
}
