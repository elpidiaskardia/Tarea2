package control;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entidad.Empleado;
import persistencia.OrmBaseDatos;

/**
 * pruebas para el metodo buscarEmpleados de la clase ControlCompa�ia se utiliza
 * como consulta ORM 
 * @author Danna Vanessa Rubio
 *
 */
class Compa�iaExceptionBuscarEmpleadoTest {

	private ControlCompa�ia compa�ia;

	/**
	 * Crea un control compa�ia con datos de prueba: un empleado asalariado, por
	 * horas y por comision
	 */
	@BeforeEach
	void configurarCompa�ia() throws Compa�iaException {
		compa�ia = new ControlCompa�ia(new OrmBaseDatos());
		compa�ia.agregarEmpleado("Ichiji Vinsmonke", "germa01", 500000, 'a', 0, 0);
		compa�ia.agregarEmpleado("Niji Vinsmonke", "germa02", 40000, 'h', 0, 0);
		compa�ia.agregarEmpleado("Sanji Vinsmonke", "germa03", 600000, 'c', 0, 0);

	}

	/**
	 * Se adicionan empleado asalariado, por horas y por comision y se busca por su
	 * identificacion estos deben de estar regitrados y mostrar la informacion de
	 * cada uno
	 */
	@Test
	void buscarEmpleadoValido() throws Compa�iaException {
		Empleado empleadoAsalariado = compa�ia.buscarEmpleado("germa01");
		assertAll("buscar empleado asalariado", () -> assertEquals("germa01", empleadoAsalariado.getIdentificacion()),
				() -> assertEquals("Ichiji Vinsmonke", empleadoAsalariado.getNombre()),
				() -> assertEquals(500000, empleadoAsalariado.getPago()));

		Empleado empleadoPorHoras = compa�ia.buscarEmpleado("germa02");
		assertAll("buscar empleado por horas", () -> assertEquals("germa02", empleadoPorHoras.getIdentificacion()),
				() -> assertEquals("Niji Vinsmonke", empleadoPorHoras.getNombre()),
				() -> assertEquals(40000, empleadoPorHoras.getPago()));

		Empleado empleadoPorComision = compa�ia.buscarEmpleado("germa03");
		assertAll("buscar empleado por comision",
				() -> assertEquals("germa03", empleadoPorComision.getIdentificacion()),
				() -> assertEquals("Sanji Vinsmonke", empleadoPorComision.getNombre()),
				() -> assertEquals(600000, empleadoPorComision.getPago()));

	}

	/**
	 * se busca un empleado que no este registrado
	 * 
	 * @throws Compa�iaException
	 */
	@Test
	void buscarEmpleadoNoRegistrado() throws Compa�iaException {
		Empleado empleado = compa�ia.buscarEmpleado("ABCD");
		assertNull(empleado);
	}
}
