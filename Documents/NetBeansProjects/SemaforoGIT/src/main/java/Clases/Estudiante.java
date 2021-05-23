package clases;
/**
 * Aquí define el objeto Estudiante que hereda de Persona.
 * @author Asier Mariné 1ºDAW
 * @version 15.0.1
 * @see Persona
 */
public class Estudiante extends Persona{
	int i_Curso;
        /**
         * Constructor de objetos de tipo Estudiante.
         */
    	public Estudiante() {
		i_Edad=25;
		s_Nombre = "Luis";
		i_Curso = 1;
	}
        /**
         * Muestra por pantalla nombre, curso y edad de ESTUDIANTE.
         */
	public void presentarse(){
	System.out.println("Soy " + s_Nombre + " Alumno de " + Integer.toString(i_Curso) 
                + " y 	tengo una edad de: " + Integer.toString(i_Edad));	
    	}
        /**
         * Llama al método presentarse() y color() de la clase ORDENADOR.
         * @return El color generado en la clase ORDENADOR.
         */
	public String preguntacolor(){
		presentarse();
		Ordenador mipc = new Ordenador();
        	return mipc.color();
    	}
}
