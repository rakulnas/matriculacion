
package ejemplo;

public class Ejemplo {

    public static void main(String[] args) {
Alumno a1 =new Alumno("Felipe");
System.out.println("El alias de alumnos es: "+a1.getAlias());
a1.setAlias ("Manolo");
System.out.println("El alias de alumno es:" +a1.getAlias());
    }
    
}
