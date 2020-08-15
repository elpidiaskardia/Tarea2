package control;

import java.util.ArrayList;

import entidad.Empleado;
import persistencia.RepositorioEmpleados;

/**
 * clase de control de compa�ia donde se regitran los empleados de este, con los
 * principales metodos del programa
 * 
 * @author danna
 * @verion 1.0
 */
public class ControlCompa�ia {
	private ArrayList<Empleado> empleados;
	private RepositorioEmpleados repositorioEmpleado;

	public ControlCompa�ia(RepositorioEmpleados repositorioEmpleado) {
		this.repositorioEmpleado = repositorioEmpleado;
	}

	/**
	 * Metodo que calcula a nomina semanal de los empleados
	 * 
	 * @return la nomina semanal de los empleados de la Compa�ia
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
	 * @param nombre             del empleado
	 * @param identificacion     unica del empleado
	 * @param pago               valor total del salario
	 * @param tipo               de que tipo es el empleado, si es 'a' para
	 *                           empleados asalariados, 'h' para empleado pagados
	 *                           semanalmente por hora, 'c' empleados pagados por
	 *                           comision
	 * @param porcentajeComision del 5% por ventas realizadas en la semana
	 * @param ventasPorSemana    cantidad de ventas hechas en la semana
	 * @param horasTrabajadas    por semana
	 * @param bono               en caso de tener mas de 40 se adiciona al salario
	 *                           200.000
	 * @return
	 */
	public boolean agregarEmpleado(String nombre, String identificacion, double pago, char tipo,
			float porcentajeComision, int ventasPorSemana, int horasTrabajadas, double bono) {
		return false;
	}

	/**
	 * busca eun empleado ya regitrado , mediante su identificacion
	 * 
	 * @return el empleado con su informacion, o null si no se encuentra
	 */
	public Empleado buscarEmpleado() throws Compa�iaException {
		return null;

	}
}
