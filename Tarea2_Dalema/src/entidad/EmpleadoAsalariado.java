package entidad;

/**
 * @version 1.0
 * @author danna Empleado que recibe un salario semanal fijo
 */
public class EmpleadoAsalariado extends Empleado {

	/**
	 * 
	 * @param nombre         del empleado
	 * @param identificacion unica del empleado
	 * @param pago           valor total del salario
	 */
	public EmpleadoAsalariado(String nombre, String identificacion, double pago) {
		super(nombre, identificacion, pago);
	}

	// contructor utilizado por ORM para la persistencia
	public void EmpleadoAsalaraido() {

	}

	@Override
	public double calcularSalario() {

		return 0;
	}

}
