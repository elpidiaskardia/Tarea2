package entidad;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * @version 1.5 Empleado perteneciente a una compañia, que recibe un pago
 *          semanal
 * 
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipoEmpleado")
public abstract class Empleado {

	@Id
	private String identificacion;
	private String nombre;
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
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.pago = pago;
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
