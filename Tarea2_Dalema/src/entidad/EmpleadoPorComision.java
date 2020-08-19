package entidad;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * 
 * @author danna y leo
 * @version 2.0 clase emplado que recibe un salario en base semanal, mas un
 *          porcentaje del 5% adicional realizado por las ventas semanales
 */
@Entity
@DiscriminatorValue("comisionista")
public class EmpleadoPorComision extends Empleado {

	private double valorVentasPorSemana;

	/**
	 * 
	 * @param nombre               del empleado
	 * @param identificacion       unica del empleado
	 * @param pago                 valor total del salario
	 * @param valorVentasPorSemana valor de todas las ventas hechas en la semana
	 */
	public EmpleadoPorComision(String nombre, String identificacion, double pago, double valorVentasPorSemana) {
		super(nombre, identificacion, pago);
		this.valorVentasPorSemana = valorVentasPorSemana;
	}

	// contructor utilizado por ORM para la presistencia
	public EmpleadoPorComision() {

	}
	
	// sets y gets para la persistencia
	public void setValorVentasPorSemana(double valorVentasPorSemana) {
		this.valorVentasPorSemana = valorVentasPorSemana;
	}
	
	public double getValorVentasPorSemana() {
		return valorVentasPorSemana;
	}

	/**
	 * metoodo que calcula la comision de las ventas, esta comiscion es el 5% de el
	 * valor de las ventas realizadas en la semana
	 * 
	 * @return la comision por las ventas hechas
	 */
	public double calcularComisionVenta() {
		if (valorVentasPorSemana > 0) {
			return valorVentasPorSemana * 0.05;
		}
		else {
		return 0;
		}
	}

	@Override
	public double calcularSalario() {
		return getPago() + calcularComisionVenta();
	}

}
