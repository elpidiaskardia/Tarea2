package control;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import persistencia.OrmBaseDatos;

/**
 * pruebas para el metodo calcularNomina de la clase ControlCompaņia se usa como
 * Repositorio ORM
 * 
 * @author Danna Vanessa Rubio
 *
 */
class ControlCompaņiaCalcularNominaTest {
	


	/**
	 * se calcula la nomina sin empleados, se espera que la nomina sea 0
	 */

	@Test
	void calcularNominaSinEmpleado() {
		ControlCompaņia compaņia = new ControlCompaņia(new OrmBaseDatos());
		double nominaEsperada = 0;
		double nominaResultante = compaņia.calcularNomina();
		assertEquals(nominaEsperada, nominaResultante);
	}

	@Test
	/**
	 * se calcula la nomina con varios empleados un empleado asalariado con 400.000
	 * de salario un empleado por horas con 1'460.000 de salario un empleado por
	 * horas con 1'170.000 de salario un empleado por comision con 425.000 de
	 * salario y un empleado por comision con 400.000 de salario se espera una
	 * nomina total de 3'855.000
	 */
	void calularNominaConEmpleadostest() throws CompaņiaException {
		ControlCompaņia compaņia = new ControlCompaņia(new OrmBaseDatos());
		compaņia.agregarEmpleado("Sasuke Ushiha", "p10", 400000, 'a', 0, 0);
		compaņia.agregarEmpleado("Asuka Langley", "p18", 30000, 'h', 0, 42);
		compaņia.agregarEmpleado("Junji Ito", "p08", 30000, 'h', 39, 0);
		compaņia.agregarEmpleado("Eiichiro oda", "p33", 400000, 'c', 0, 500000);
		compaņia.agregarEmpleado("Hiromu Arakawa", "p24", 400000, 'c', 0, 0);
		double nominaEsperada = 2660000;
		double nominaResultante = compaņia.calcularNomina();
		assertEquals(nominaEsperada, nominaResultante);

	}

}
