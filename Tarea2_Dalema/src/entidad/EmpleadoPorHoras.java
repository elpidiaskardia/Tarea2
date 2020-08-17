package entidad;

/**
 * 
 * @author danna
 * @version 1.0 empleado que recibe un valor por cada hora trabbajada, si estas
 *          horas suman mas de 40h recibe un bono de 200.000
 */
public class EmpleadoPorHoras extends Empleado {
	private int horasTrabajadas;
	private double bono;

	/**
	 * 
	 * @param nombre          del empleado
	 * @param identificacion  unica del empleado
	 * @param pago            valor total del salario
	 * @param horasTrabajadas por semana
	 * @param bono            en caso de tener mas de 40 se adiciona al salario
	 *                        200.000
	 */
	public EmpleadoPorHoras(String nombre, String identificacion, double pago, int horasTrabajadas, double bono) {
		super(nombre, identificacion, pago);
		this.horasTrabajadas = horasTrabajadas;
		this.bono = bono;

	}

	// constructor utilizado por ORM para la persistencia
	public void EmpleadoPorHoras() {

	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public double getBono() {
		return bono;
	}

	// sets utilizados por ORM
	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public void setBono(double bono) {
		this.bono = bono;
	}

	@Override
	public double calcularSalario() {

		return 0;
	}
}
