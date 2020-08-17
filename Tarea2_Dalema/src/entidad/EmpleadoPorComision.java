package entidad;

import java.util.ArrayList;

/**
 * 
 * @author danna
 * @version 2.0 clase emplado que recibe un salario en base semanal, mas un
 *          porcentaje del 5% adicional realizado por las ventas semanales
 */

public class EmpleadoPorComision extends Empleado {

	private double valorVentasPorSemana;
	private ArrayList<VentasPorSemana> ventas;

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
	public void EmpleadoPorComision() {

	}

	public double getValorVentasPorSemana() {
		return valorVentasPorSemana;
	}

// sets utilizador por ORM

	public void setValorVentasPorSemana(int valorVentasPorSemana) {
		this.valorVentasPorSemana = valorVentasPorSemana;
	}

	/**
	 * metodo que agrega a la lista ventas una venta
	 * 
	 * @param valorUnidad    precio del articulo que se vende
	 * @param cantidad       del articulo
	 * @param nombreArticulo nombre del articulo que se vende
	 * @return true si se ha realizado la venta con exito, en otro caso false de no
	 *         poder agregarse
	 */
	public boolean agregarVenta(double valorUnidad, int cantidad, String nombreArticulo) {
		return false;
	}

	/**
	 * metoodo que calcula la comision de las ventas, esta comiscion es el 5% de el
	 * valor de las ventas realizadas en la semana
	 * 
	 * @param valorVentaPorSemana valor total de las ventas hechas en la semana
	 * @return la comision por las ventas hechas
	 */
	public double calcularComisionVenta(double valorVentaPorSemana) {
		return 0;
	}

	@Override
	public double calcularSalario() {

		return 0;
	}

}
