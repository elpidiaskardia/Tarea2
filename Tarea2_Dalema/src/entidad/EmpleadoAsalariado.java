package entidad;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @version 1.0
 * @author danna Empleado que recibe un salario semanal fijo
 */
@Entity
@DiscriminatorValue("asalariado")

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

	// contructor utilizado por ORM para la presistencia

	public EmpleadoAsalariado() {
		
	}



	@Override
	public double calcularSalario() {
		return getPago();
	} 

}
