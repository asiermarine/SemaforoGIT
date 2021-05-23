package clases;
import java.util.Random;
/**
 * Aquí se define el objeto Ordenador.
 * @author Asier Mariné 1ºDAW
 * @version 15.0.1
 */
public class Ordenador {
    /**
     * COnstructor de objetos de tipo Ordenador.
     */
    public Ordenador() {}
    /**
     * Genera un valor aleatorio entre 0 y 2.
     * @return Los valores 0, 1 y 2 (rojo, amarillo y verde respectivamente).
     */
    public String color(){
    	Random randomGenerator = new Random();
	int randomInt = randomGenerator.nextInt(3);
	if(randomInt == 0)
	{  return "rojo";}
	else if(randomInt == 1)
	{ return "amarillo";}
	else
	{ return "verde";}
    }
}
