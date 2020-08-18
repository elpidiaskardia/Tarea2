/**
 * 
 */
package control;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entidad.Empleado;
import entidad.EmpleadoAsalariado;
import entidad.EmpleadoPorComision;

/**
 * Prueba r�pida
 * @author Manuela Rend�n
 * @version 1.0
 */
public class PruebaOrm_Rapida {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = 
				Persistence.createEntityManagerFactory("datosOrm");
		EntityManager gestorBD = fabrica.createEntityManager();
				
				gestorBD.getTransaction().begin();
				Empleado empleado = new EmpleadoAsalariado("camila","1053",152);
				gestorBD.persist(empleado);
				gestorBD.getTransaction().commit();
				
				Empleado empleadoBuscado = gestorBD.find(Empleado.class, "1053");
				System.out.println(empleadoBuscado.getNombre());
				gestorBD.close();

	}

}
