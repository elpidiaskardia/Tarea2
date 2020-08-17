package entidad;

/**
 * 
 * @author danna
 * @version 1.2 permite crear un empleado deacuerdo al tipo selesccionado, asi
 *          las clases que usan los emplados no tiene que conocer las hijas,
 *          solo la clase padre, esto corresponde al patron de diseño FACTORY
 */

public class FabricaEmpleado {

	/**
	 * 
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
	public static Empleado crearEmpleado(String nombre, String identificacion, double pago, char tipo,
			double valorVentasPorSemana, int horasTrabajadas, double bono) {
		{
			switch (tipo) {
			case 'a':
			case 'A':
				return new EmpleadoAsalariado(nombre, identificacion, pago);
			case 'h':
			case 'H':
				return new EmpleadoPorHoras(nombre, identificacion, pago, horasTrabajadas);
			case 'c':
			case 'C':
				return new EmpleadoPorComision(nombre, identificacion, pago, valorVentasPorSemana);
			}
			return null;
		}

	}
}
