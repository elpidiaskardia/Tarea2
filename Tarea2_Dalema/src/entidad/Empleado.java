package entidad;

/**
 * @version 1.5 Empleado perteneciente a una compañia, que recibe un pago
 *          semanal
 * 
 */
public abstract class Empleado {

	private String nombre;
	private String identificacion;
	private double pago;

	/**
	 * metodo que calcula el salario de un empleado
	 * 
	 * @return el salario semanal del empleado
	 */
	public abstract double calcularSalario();

	/**
	 * 
	 * @param nombre         del empleado
	 * @param identificacion unica del empleado
	 * @param pago           valor total del salario
	 */

	public Empleado(String nombre, String identificacion, double pago) {

	}

	// constructor usado por ORM para la persistencia
	public Empleado() {

	}

	public String getNombre() {
		return nombre;
	}

	public double getPago() {
		return pago;
	}

	public String getIdentificacion() {
		return identificacion;
	}

//metodos Set para el uso de ORM
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public void setPago(double pago) {
		this.pago = pago;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
