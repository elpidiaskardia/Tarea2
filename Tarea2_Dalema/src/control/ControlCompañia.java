package control;

import entidad.Empleado;
import entidad.FabricaEmpleado;
import persistencia.RepositorioEmpleados;

/**
 * clase de control de compa�ia donde se regitran los empleados de este, con los
 * principales metodos del programa
 * 
 * @author danna
 * @verion 1.0
 */
public class ControlCompa�ia {
	private RepositorioEmpleados repositorioEmpleado;

	public ControlCompa�ia(RepositorioEmpleados repositorioEmpleado) {
		this.repositorioEmpleado = repositorioEmpleado;
	}

	/**
	 * Metodo que calcula a nomina total semanal de los empleados
	 * 
	 * @return la nomina semanal de todos los empleados de la Compa�ia
	 */
	public double calcularNomina() {
		double nomina = 0;
		
		for(Empleado empleado : repositorioEmpleado.consultarEmpleados()) {
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
			double valorVentasPorSemana, int horasTrabajadas) throws Compa�iaException{
		Empleado nuevoEmpleado =FabricaEmpleado.crearEmpleado(nombre, identificacion, pago, tipo,
				horasTrabajadas, valorVentasPorSemana);
		if(nuevoEmpleado==null) {
			throw new Compa�iaException("El empleado no pudo ser creado");
		}
		
		repositorioEmpleado.adicionarEmpleado(nuevoEmpleado);
		return true;
	}

	/**
	 * busca eun empleado ya regitrado , mediante su identificacion
	 * 
	 * @identificacion es el id unico de cada empleado
	 * @return el empleado con su informacion, o null si no se encuentra
	 */
	public Empleado buscarEmpleado(String identificacion) throws Compa�iaException {
		Empleado empleadoBuscado = repositorioEmpleado.buscarEmpleado(identificacion);
		if(empleadoBuscado == null) {
			throw new Compa�iaException("El empleado con la identificacion "+identificacion+" no existe"); 
		}
		return empleadoBuscado;
	}
}
