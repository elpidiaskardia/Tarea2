package control;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import persistencia.OrmBaseDatos;

/**
 * pruebas para el metodo agregarEmpleado de ControlCompañia
 * 
 * @author Danna Vanessa Rubio
 *
 */
class ControlCompañiaAgregarEmpleadoTest {
	/**
	 * se adiciona empleado asalariado, empleado por horas y empleado por comision,
	 * con identificacion unica y pago positivo
	 */
	@Test

	void agregarEmpleadoValidoTest() throws CompañiaException {
		ControlCompañia compañia = new ControlCompañia(new OrmBaseDatos());
		boolean adicionarEmpleadoAslariado = compañia.agregarEmpleado("Sasuke Ushiha", "p10", 400000, 'a', 0, 0);
		boolean adicionarEmpleadoPorHoras = compañia.agregarEmpleado("Asuka Langley", "p02", 30000, 'h', 0, 0);
		boolean adicionarEmpleadoPorComision = compañia.agregarEmpleado("Echiro Oda", "p01", 400000, 'a', 0, 0);
		assertTrue(adicionarEmpleadoAslariado);
		assertTrue(adicionarEmpleadoPorHoras);
		assertTrue(adicionarEmpleadoPorComision);
	}

	/**
	 * se verifica que no se adicione un empleado con la identificacion repetida
	 */
	@Test
	void agregarEmpleadoRepetidoTest() throws CompañiaException {
		ControlCompañia compañia = new ControlCompañia(new OrmBaseDatos());
		compañia.agregarEmpleado("Alan Brito", "p13", 700000, 'a', 0, 0);
		boolean adicionarRepetido = compañia.agregarEmpleado("Alan Brito", "p13", 700000, 'a', 0, 0);
		assertFalse(adicionarRepetido);
	}

	/**
	 * se verifica que no se agregue un empleado sin pago base
	 */
	void agregarEmpleadoSinPagoBase() throws CompañiaException {
		ControlCompañia compañia = new ControlCompañia(new OrmBaseDatos());
		assertThrows(CompañiaException.class, () -> compañia.agregarEmpleado("Armando Casas", "p22", 0, 'c', 0, 0));
	}

	/**
	 * se verifica que no se agregue un empleado con pago base negativo
	 */
	void agregarEmpleadoConPagoBaseNegativo() throws CompañiaException {
		ControlCompañia compañia = new ControlCompañia(new OrmBaseDatos());
		assertThrows(CompañiaException.class, () -> compañia.agregarEmpleado("Aitor Tilla", "p07", -60000, 'h', 0, 0));
	}

	/**
	 * si se ingresa un tipo que no sea a--> Empleado asalariado, h---> Empleado por
	 * horas, c--> empleado por comision , no se permitira agregar.
	 */
	void agregarEmpleadoTipoDesconocido() throws CompañiaException {
		ControlCompañia compañia = new ControlCompañia(new OrmBaseDatos());
		assertThrows(CompañiaException.class, () -> compañia.agregarEmpleado("Don Fulano", "p80", 300000, 's', 0, 0));
	}

}
