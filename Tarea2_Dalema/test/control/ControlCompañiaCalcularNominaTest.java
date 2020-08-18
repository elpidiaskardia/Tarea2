package control;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import persistencia.OrmBaseDatos;

/**
 * pruebas para el metodo calcularNomina de la clase ControlCompa�ia se usa como
 * Repositorio ORM
 * 
 * @author danna
 *
 */
class ControlCompa�iaCalcularNominaTest {

	@Test
	/**
	 * se calcula la nomina con varios empleados un empleado asalariado con 400.000
	 * de salario un empleado por horas con 1'460.000 de salario un empleado por
	 * horas con 1'170.000 de salario un empleado por comision con 425.000 de
	 * salario y un empleado por comision con 400.000 de salario se espera una
	 * nomina total de 3'855.000
	 */
	void calularNominaConEmpleadostest() throws Compa�iaException {
		ControlCompa�ia compa�ia = new ControlCompa�ia(new OrmBaseDatos());
		compa�ia.agregarEmpleado("Sasuke Ushiha", "p10", 400000, 'a', 0, 0);
		compa�ia.agregarEmpleado("Asuka Langley", "p18", 30000, 'h', 0, 42);
		compa�ia.agregarEmpleado("Junji Ito", "p08", 30000, 'h', 39, 0);
		compa�ia.agregarEmpleado("Eiichiro oda", "p33", 400000, 'c', 0, 500000);
		compa�ia.agregarEmpleado("Hiromu Arakawa", "p24", 400000, 'c', 0, 0);
		double nominaEsperada = 3855000;
		double nominaResultante = compa�ia.calcularNomina();
		assertEquals(nominaEsperada, nominaResultante);

	}

	/**
	 * se calcula la nomina sin empleados, se espera que la nomina sea 0
	 */

	@Test
	void calcularNomainaSinEEmpleado() {
		ControlCompa�ia compa�ia = new ControlCompa�ia(new OrmBaseDatos());
		double nominaEsperada = 0;
		double nominaResultante = compa�ia.calcularNomina();
		assertEquals(nominaEsperada, nominaResultante);
	}

}
