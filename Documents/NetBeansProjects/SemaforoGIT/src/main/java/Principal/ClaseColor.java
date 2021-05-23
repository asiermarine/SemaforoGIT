package principal;
import clases.Profesor;
/**
 * Aquí se define a la clase color.
 * @author Asier Mariné 1ºDAW
 * @version 15.0.1
 */
public class ClaseColor {
    /**
     * La clase PROFESOR pregunta a ALUMNO por un color (rojo, amarillo y verde).
     * Muestra el resultado por pantalla.
     * @param args 
     */
	public static void main(String[] args) {
		Profesor teacher = new Profesor();
		String color = teacher.preguntacolor();
		System.out.println("La respuesta recibida es:" + color);
	} 
}
