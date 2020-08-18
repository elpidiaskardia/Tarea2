/**
 * 
 */
package control;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entidad.Empleado;
import entidad.EmpleadoPorComision;

/**
 * Prueba rápida
 * @author Manuela Rendón
 * @version 1.0
 */
public class PruebaOrm_Rapida {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = 
				Persistence.createEntityManagerFactory("datosOrm");
		EntityManager gestorBD = fabrica.createEntityManager();
				
				gestorBD.getTransaction().begin();
				Empleado empleado = new EmpleadoPorComision("Sofia", "1525985", 23548, 200);
				gestorBD.persist(empleado);
				gestorBD.getTransaction().commit();
				
				Empleado empleadoBuscado = gestorBD.find(Empleado.class, "1525985");
				System.out.println(empleadoBuscado.getNombre());
				gestorBD.close();

	}

}
