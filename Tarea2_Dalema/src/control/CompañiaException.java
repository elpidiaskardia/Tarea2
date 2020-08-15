package control;

/**
 * Excepciones relacionadas con el registro de empleados en el contro compañia,
 * especialmente por no cumplir alguna regla del negocio
 * 
 * @version 1.0
 */

@SuppressWarnings("serial")
public class CompañiaException extends Exception {
	public CompañiaException(String mensaje) {
		super(mensaje);
	}

}
