package control;

import java.util.List;

import entidad.Empleado;
import entidad.FabricaEmpleado;
import persistencia.RepositorioEmpleados;

/**
 * clase de control de compañia donde se regitran los empleados de este, con los
 * principales metodos del programa
 * 
 * @author Danna Vanessa Rubio, Leonardo Sanchez
 * @verion 2.1
 */
public class ControlCompañia {
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
		List<Empleado> empleados = repositorioEmpleado.consultarEmpleados();
		double nomina = 0;
		for (Empleado empleado : empleados) {
			nomina += empleado.calcularSalario();
		}
		return nomina;
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
	 * @param horasTrabajadas      por semana 200.000
	 * @return
	 */
	public boolean agregarEmpleado(String nombre, String identificacion, double pago, char tipo,
			double valorVentasPorSemana, int horasTrabajadas) throws CompañiaException {
		if(valorVentasPorSemana < 0) {
			throw new CompañiaException("El valor de ventas por semana debe ser positivo");
		}
		if(horasTrabajadas < 0) {
			throw new CompañiaException("El valor de horas trabajadas debe ser positivo");
		}
		Empleado empleadoBuscado = buscarEmpleado(identificacion);
		if (empleadoBuscado == null) {
			Empleado empleadoNuevo = FabricaEmpleado.crearEmpleado(nombre, identificacion, pago, tipo, horasTrabajadas, valorVentasPorSemana);
			return repositorioEmpleado.adicionarEmpleado(empleadoNuevo);
		}
		return false;

	}

	/**
	 * busca eun empleado ya regitrado , mediante su identificacion
	 * 
	 * @identificacion es el id unico de cada empleado
	 * @return el empleado con su informacion, o null si no se encuentra
	 */
	public Empleado buscarEmpleado(String identificacion) throws CompañiaException {
		return repositorioEmpleado.buscarEmpleado(identificacion);
	}
}
