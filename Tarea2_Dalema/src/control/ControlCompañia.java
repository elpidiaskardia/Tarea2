package control;

import java.util.ArrayList;

import entidad.Empleado;
import persistencia.RepositorioEmpleados;

/**
 * clase de control de compañia donde se regitran los empleados de este, con los
 * principales metodos del programa
 * 
 * @author danna
 * @verion 1.0
 */
public class ControlCompañia {
	private ArrayList<Empleado> empleados;
	private RepositorioEmpleados repositorioEmpleado;

	public ControlCompañia(RepositorioEmpleados repositorioEmpleado) {
		this.repositorioEmpleado = repositorioEmpleado;
	}

	/**
	 * Metodo que calcula a nomina total semanal de los empleados
	 * 
	 * @return la nomina semanal de todos los empleados de la Compañia
	 */
	public double calcularNomina() {
		return 0;
	}

	/**
	 * * Adiciona nuevos empleados , es decir registra la informacion y se almacena
	 * la creacion del objeto especifico se realiza mediante una fabrica
	 * 
	 * @return true si se agrego con exito el empleado,en otro caso false de no
	 *         poder realizarse
	 * @param nombre               del empleado
	 * @param identificacion       unica del empleado
	 * @param pago                 valor total del salario
	 * @param tipo                 de que tipo es el empleado, si es 'a' para
	 *                             empleados asalariados, 'h' para empleado pagados
	 *                             semanalmente por hora, 'c' empleados pagados por
	 *                             comision
	 * @param valorVentasPorSemana valor de todas las ventas hechas en la semana
	 * @param horasTrabajadas      por semana
	 * @param bono                 en caso de tener mas de 40 se adiciona al salario
	 *                             200.000
	 * @return
	 */
	public boolean agregarEmpleado(String nombre, String identificacion, double pago, char tipo,
			double valorVentasPorSemana, int horasTrabajadas, double bono) {
		return false;
	}

	/**
	 * busca eun empleado ya regitrado , mediante su identificacion
	 * 
	 * @return el empleado con su informacion, o null si no se encuentra
	 */
	public Empleado buscarEmpleado() throws CompañiaException {
		return null;

	}
}
