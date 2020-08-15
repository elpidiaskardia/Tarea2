package persistencia;

import java.util.List;

import entidad.Empleado;

/**
 * Servicios relacionados con la gestion de los datos de los empleado en un
 * repositorio (consultar, adicionar, buscar, borrar)
 * 
 * @version 1.0
 */

public interface RepositorioEmpleados {

	/**
	 * Consulta toda la lista de los empledados que hay registrados
	 * 
	 * @return la lista (List) con los empleados. En caso de no existir empleados
	 *         registrados retorna una lista vacia.
	 */
	public List<Empleado> consultarEmpleados();

	/**
	 * Adiciona un empleado al repositorio para hacerlo persistente
	 * 
	 * @param empleado el objeto empleado que se desea guardar, debe ser diferente
	 *                 de null
	 * @return un valor booleano indicando si se pudo guardar en el repositorio o no
	 */
	public abstract boolean adicionarEmpleado(Empleado empleado);

	/**
	 * Busca un empleado en la base de datos a partir de su identificacion
	 * 
	 * @param identificacion el codigo de identificacion del empleado que se desea
	 *                       buscar, debe ser diferente de null
	 * @return el objeto empleado con la identificcacion dada, o null si no se
	 *         encuentra.
	 */
	public abstract Empleado buscarEmpleado(String identificacion);

	/**
	 * Elimina toda la informacion del empleado en el repositorio
	 * 
	 * @param empleado el objeto empleado que se desea borrar, debe ser diferente de
	 *                 null
	 * @return un valor booleano indicando si se pudo borrar en el repositorio o no
	 * 
	 */
	public abstract boolean borrarBarco(Empleado empleado);
}
