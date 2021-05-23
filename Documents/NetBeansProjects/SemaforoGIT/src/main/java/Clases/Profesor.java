package clases;

/**
 * Aquí se define el objeto Profesor
 * @author Asier Mariné 1ºDAW
 * @version 15.0.1
 */

public class Profesor  extends Persona{
        /**
         * Constructor de objetos de tipo Profesor.
         */
    	public Profesor() {}				
        /**
         * Pregunta a ESTUDIANTE sobre el color
         * @return El color del semáforo
         */
    	public String preguntacolor(){
		Estudiante alumno = new Estudiante();
		String colorRec = alumno.preguntacolor();
		return colorRec;
    	}
}