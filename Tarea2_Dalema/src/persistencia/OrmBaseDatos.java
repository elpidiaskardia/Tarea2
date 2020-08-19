package persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entidad.Empleado;

/**
 * Usa una base de datos como repositorio de los datos de los empleados, y
 * ofrece los servicios definidos en RepositorioEmpleados.
 * 
 * usa JPA y EclipseLink para el trabajo con la base de datos (es decir, un
 * ORM). La base de datos es "empleadosOrm.db" (motor SQLite)
 * 
 * Usa una sola instancia del EntityManager para todos los métodos, y solo se
 * cierra cuando se destruye el objeto
 * 
 * @version 1.1
 */
public class OrmBaseDatos implements RepositorioEmpleados {

	private EntityManager gestorBd;

	/**
	 * La unidad de persistencia ("Persistence unit") llamada datosOrm esta definida
	 * en el archivo de configuracion persistence.xml, en la carpeta META-INF
	 */
	public OrmBaseDatos() {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("datosOrm");
		gestorBd = fabrica.createEntityManager();
	}

	@Override
	public List<Empleado> consultarEmpleados() {
		Query query = gestorBd.createQuery("select b from Empleado b");
		List<Empleado> empleados = query.getResultList();
		return empleados;
	}

	@Override
	public boolean adicionarEmpleado(Empleado empleado) {
		try {
			gestorBd.getTransaction().begin();
			gestorBd.persist(empleado);
			gestorBd.getTransaction().commit();
		} catch (Exception errorCrear) {
			return false;
		}

		return true;
	}

	@Override
	public Empleado buscarEmpleado(String identificacion) {
		Empleado empleado = gestorBd.find(Empleado.class, identificacion);
		return empleado;
	}

	@Override
	public boolean borrarEmpleado(Empleado empleado) {
		try {
			gestorBd.getTransaction().begin();
			// Esto funciona porque el EntityManager está abierto todo el tiempo
			// Y el objeto empleado ha sido consultado previamente,
			// por lo que está "enlazado" con la base de datos.
			// Si no fuera el caso debe "enlazarse" (ver clase OrmBaseDatos)
			gestorBd.remove(empleado);
			gestorBd.getTransaction().commit();
		} catch (Exception errorBorrar) {
			return false;
		}
		return true;
	}

	/**
	 * Cierra el EntitiyManager cuando se vaya a destruir este objeto
	 */
	@Override
	protected void finalize() {
		gestorBd.close();
	}

}
