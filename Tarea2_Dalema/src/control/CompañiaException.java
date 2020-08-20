package control;

/**
 * Excepciones relacionadas con el registro de empleados en el contro compa�ia,
 * especialmente por no cumplir alguna regla del negocio
 * 
 * @author Danna Vanessa Rubio
 * @version 1.0
 */

@SuppressWarnings("serial")
public class Compa�iaException extends Exception {
	public Compa�iaException(String mensaje) {
		super(mensaje);
	}

}
