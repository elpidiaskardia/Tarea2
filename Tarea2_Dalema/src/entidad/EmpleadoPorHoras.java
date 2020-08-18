package entidad;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * 
 * @author danna
 * @version 1.0 empleado que recibe un valor por cada hora trabbajada, si estas
 *          horas suman mas de 40h recibe un bono de 200.000
 */
@Entity
@DiscriminatorValue("por_Hora")
public class EmpleadoPorHoras extends Empleado {
	private int horasTrabajadas;

	/**
	 * 
	 * @param nombre          del empleado
	 * @param identificacion  unica del empleado
	 * @param pago            valor total del salario
	 * @param horasTrabajadas por semana 200.000
	 */
	public EmpleadoPorHoras(String nombre, String identificacion, double pago, int horasTrabajadas) {
		super(nombre, identificacion, pago);
		this.horasTrabajadas = horasTrabajadas;

	}

	// constructor utilizado por ORM para la persistencia
	public EmpleadoPorHoras() {

	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	// sets utilizados por ORM
	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	@Override
	public double calcularSalario() {
		double salario = horasTrabajadas * getPago();
		if(darBono()) {
			salario += 200000;
		}
		
		return salario;
	}

	/**
	 * metodo que asigna quien debe tener un bono mirando las horas trabajadas, si
	 * son mayores a 40 se le aumenta al salario 200.000
	 * 
	 * @param horasTrabajadas
	 * @return
	 */
	public boolean darBono() {
		if(horasTrabajadas > 40) {
			return true;
		}
		return false;
	}
}
