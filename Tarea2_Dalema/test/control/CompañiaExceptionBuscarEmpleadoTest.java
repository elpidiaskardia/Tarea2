package control;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entidad.Empleado;
import persistencia.OrmBaseDatos;

/**
 * pruebas para el metodo buscarEmpleados de la clase ControlCompañia se utiliza
 * como consulta ORM 
 * @author Danna Vanessa Rubio
 *
 */
class CompañiaExceptionBuscarEmpleadoTest {

	private ControlCompañia compañia;

	/**
	 * Crea un control compañia con datos de prueba: un empleado asalariado, por
	 * horas y por comision
	 */
	@BeforeEach
	void configurarCompañia() throws CompañiaException {
		compañia = new ControlCompañia(new OrmBaseDatos());
		compañia.agregarEmpleado("Ichiji Vinsmonke", "germa01", 500000, 'a', 0, 0);
		compañia.agregarEmpleado("Niji Vinsmonke", "germa02", 40000, 'h', 0, 0);
		compañia.agregarEmpleado("Sanji Vinsmonke", "germa03", 600000, 'c', 0, 0);

	}

	/**
	 * Se adicionan empleado asalariado, por horas y por comision y se busca por su
	 * identificacion estos deben de estar regitrados y mostrar la informacion de
	 * cada uno
	 */
	@Test
	void buscarEmpleadoValido() throws CompañiaException {
		Empleado empleadoAsalariado = compañia.buscarEmpleado("germa01");
		assertAll("buscar empleado asalariado", () -> assertEquals("germa01", empleadoAsalariado.getIdentificacion()),
				() -> assertEquals("Ichiji Vinsmonke", empleadoAsalariado.getNombre()),
				() -> assertEquals(500000, empleadoAsalariado.getPago()));

		Empleado empleadoPorHoras = compañia.buscarEmpleado("germa02");
		assertAll("buscar empleado por horas", () -> assertEquals("germa02", empleadoPorHoras.getIdentificacion()),
				() -> assertEquals("Niji Vinsmonke", empleadoPorHoras.getNombre()),
				() -> assertEquals(40000, empleadoPorHoras.getPago()));

		Empleado empleadoPorComision = compañia.buscarEmpleado("germa03");
		assertAll("buscar empleado por comision",
				() -> assertEquals("germa03", empleadoPorComision.getIdentificacion()),
				() -> assertEquals("Sanji Vinsmonke", empleadoPorComision.getNombre()),
				() -> assertEquals(600000, empleadoPorComision.getPago()));

	}

	/**
	 * se busca un empleado que no este registrado
	 * 
	 * @throws CompañiaException
	 */
	@Test
	void buscarEmpleadoNoRegistrado() throws CompañiaException {
		Empleado empleado = compañia.buscarEmpleado("ABCD");
		assertNull(empleado);
	}
}
