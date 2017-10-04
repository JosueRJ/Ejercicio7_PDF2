
package ejercicio7;

public class Empleado {
    //Atributo estatico
    private int Edad;
    private static String Nombre;
    
    
    //Constructor

    public Empleado(int Edad, String Nombre) {
        this.Edad = Edad;
        this.Nombre = Nombre;
    }
    
    //Set y get

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public static String getNombre() {
        return Nombre;
    }

    public static void setNombre(String Nombre) {
        Empleado.Nombre = Nombre;
    }
    
    
}
