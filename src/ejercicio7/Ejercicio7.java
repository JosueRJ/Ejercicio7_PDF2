
package ejercicio7;

public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado e1 = new Empleado(25, "Juan");
        Empleado e2 = new Empleado(26, "Pedro");
        
        System.out.println("Edad :"+e1.getEdad()+"Nombre :"+e1.getNombre());
        System.out.println("Edad :"+e2.getEdad()+"Nombre :"+e2.getNombre());
        
    }
    
}
