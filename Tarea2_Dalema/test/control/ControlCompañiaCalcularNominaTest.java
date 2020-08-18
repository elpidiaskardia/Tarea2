package control;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import persistencia.OrmBaseDatos;

/**
 * pruebas para el metodo calcularNomina de la clase ControlCompañia se usa como
 * Repositorio ORM
 * 
 * @author danna
 *
 */
class ControlCompañiaCalcularNominaTest {

	@Test
	/**
	 * se calcula la nomina con varios empleados un empleado asalariado con 400.000
	 * de salario un empleado por horas con 1'460.000 de salario un empleado por
	 * horas con 1'170.000 de salario un empleado por comision con 425.000 de
	 * salario y un empleado por comision con 400.000 de salario se espera una
	 * nomina total de 3'855.000
	 */
	void calularNominaConEmpleadostest() throws CompañiaException {
		ControlCompañia compañia = new ControlCompañia(new OrmBaseDatos());
		compañia.agregarEmpleado("Sasuke Ushiha", "p10", 400000, 'a', 0, 0);
		compañia.agregarEmpleado("Asuka Langley", "p18", 30000, 'h', 0, 42);
		compañia.agregarEmpleado("Junji Ito", "p08", 30000, 'h', 39, 0);
		compañia.agregarEmpleado("Eiichiro oda", "p33", 400000, 'c', 0, 500000);
		compañia.agregarEmpleado("Hiromu Arakawa", "p24", 400000, 'c', 0, 0);
		double nominaEsperada = 3855000;
		double nominaResultante = compañia.calcularNomina();
		assertEquals(nominaEsperada, nominaResultante);

	}

	/**
	 * se calcula la nomina sin empleados, se espera que la nomina sea 0
	 */

	@Test
	void calcularNomainaSinEEmpleado() {
		ControlCompañia compañia = new ControlCompañia(new OrmBaseDatos());
		double nominaEsperada = 0;
		double nominaResultante = compañia.calcularNomina();
		assertEquals(nominaEsperada, nominaResultante);
	}

}
