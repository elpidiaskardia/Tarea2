package control;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import persistencia.OrmBaseDatos;

/**
 * pruebas para el metodo agregarEmpleado de ControlCompa�ia
 * 
 * @author danna
 *
 */
class ControlCompa�iaAgregarEmpleadoTest {
	/**
	 * se adiciona empleado asalariado, empleado por horas y empleado por comision,
	 * con identificacion unica y pago positivo
	 */
	@Test

	void agregarEmpleadoValidoTest() throws Compa�iaException {
		ControlCompa�ia compa�ia = new ControlCompa�ia(new OrmBaseDatos());
		boolean adicionarEmpleadoAslariado = compa�ia.agregarEmpleado("Sasuke Ushiha", "p10", 400000, 'a', 0, 0);
		boolean adicionarEmpleadoPorHoras = compa�ia.agregarEmpleado("Asuka Langley", "p02", 30000, 'h', 0, 0);
		boolean adicionarEmpleadoPorComision = compa�ia.agregarEmpleado("Echiro Oda", "p01", 400000, 'a', 0, 0);
		assertTrue(adicionarEmpleadoAslariado);
		assertTrue(adicionarEmpleadoPorHoras);
		assertTrue(adicionarEmpleadoPorComision);
	}

	/**
	 * se verifica que no se adicione un empleado con la identificacion repetida
	 */
	@Test
	void agregarEmpleadoRepetidoTest() throws Compa�iaException {
		ControlCompa�ia compa�ia = new ControlCompa�ia(new OrmBaseDatos());
		compa�ia.agregarEmpleado("Alan Brito", "p13", 700000, 'a', 0, 0);
		boolean adicionarRepetido = compa�ia.agregarEmpleado("Alan Brito", "p13", 700000, 'a', 0, 0);
		assertFalse(adicionarRepetido);
	}

	/**
	 * se verifica que no se agregue un empleado sin pago base
	 */
	void agregarEmpleadoSinPagoBase() throws Compa�iaException {
		ControlCompa�ia compa�ia = new ControlCompa�ia(new OrmBaseDatos());
		assertThrows(Compa�iaException.class, () -> compa�ia.agregarEmpleado("Armando Casas", "p22", 0, 'c', 0, 0));
	}

	/**
	 * se verifica que no se agregue un empleado con pago base negativo
	 */
	void agregarEmpleadoConPagoBaseNegativo() throws Compa�iaException {
		ControlCompa�ia compa�ia = new ControlCompa�ia(new OrmBaseDatos());
		assertThrows(Compa�iaException.class, () -> compa�ia.agregarEmpleado("Aitor Tilla", "p07", -60000, 'h', 0, 0));
	}

	/**
	 * si se ingresa un tipo que no sea a--> Empleado asalariado, h---> Empleado por
	 * horas, c--> empleado por comision , no se permitira agregar.
	 */
	void agregarEmpleadoTipoDesconocido() throws Compa�iaException {
		ControlCompa�ia compa�ia = new ControlCompa�ia(new OrmBaseDatos());
		assertThrows(Compa�iaException.class, () -> compa�ia.agregarEmpleado("Don Fulano", "p80", 300000, 's', 0, 0));
	}

}
