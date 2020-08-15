package entidad;

/**
 * 
 * @author danna
 * @version 1.0 clase emplado que recibe un salario en base semanal, mas un
 *          porcentaje del 5% adicional realizado por las ventas semanales
 */
public class EmpleadoPorComision extends Empleado {
	private float porcentajeComision;
	private int ventasPorSemana;

	/**
	 * 
	 * @param nombre             del empleado
	 * @param identificacion     unica del empleado
	 * @param pago               valor total del salario
	 * @param porcentajeComision del 5% por ventas realizadas en la semana
	 * @param ventasPorSemana    cantidad de ventas hechas en la semana
	 */
	public EmpleadoPorComision(String nombre, String identificacion, double pago, float porcentajeComision,
			int ventasPorSemana) {
		super(nombre, identificacion, pago);
		this.porcentajeComision = porcentajeComision;
		this.ventasPorSemana = ventasPorSemana;
	}

	@Override
	public double calcularSalario() {

		return 0;
	}

	// contructor utilizado por ORM para la presistencia
	public void EmpleadoPorComision() {

	}

	public float getPorcentajeComision() {
		return porcentajeComision;
	}

	public int getVentasPorSemana() {
		return ventasPorSemana;
	}

// sets utilizador por ORM
	public void setPorcentajeComision(float porcentajeComision) {
		this.porcentajeComision = porcentajeComision;
	}

	public void setVentasPorSemana(int ventasPorSemana) {
		this.ventasPorSemana = ventasPorSemana;
	}

}
