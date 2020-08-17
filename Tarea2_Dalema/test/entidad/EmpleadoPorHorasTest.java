package entidad;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * pruebas del metodo calcularSalario para un empleado contratado por horas
 * 
 * @author danna
 *
 */
class EmpleadoPorHorasTest {

	/**
	 * el valor de una hora trabajada es de 30.000 y la cantidad de horas trabajadas
	 * es 42 como trabajo mas de 40 horas de adiciona un bono de 200.000 se espera
	 * un salario de 1'460.000 en la semana
	 */
	@Test
	void calcularSaldoConHorasMayorCuarentaTest() {
		EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Asuka Langley", "p18", 30000, 42);
		double salarioEsperado = 1460000;
		double salarioEmpleadoAsalariado = empleadoPorHoras.calcularSalario();
		assertEquals(salarioEsperado, salarioEmpleadoAsalariado);
	}

	/**
	 * el valor de la hora trabajada es de 30.000 y se trabajo menos de 40 horas se
	 * espera un salairo de 1'170.000
	 */
	@Test
	void calcularSaldoConHorasMenorCuarentaTest() {
		EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Junji Ito", "p08", 30000, 39);
		double salarioEsperado = 1170000;
		double salarioEmpleadoAsalariado = empleadoPorHoras.calcularSalario();
		assertEquals(salarioEsperado, salarioEmpleadoAsalariado);
	}

	/**
	 * el valor de una hora de trabajo es de 30.000, pero no tiene horas trbajadas,
	 * se espera un salario de 0
	 */
	@Test
	void calcularSalarioSinHorasTrabajadas() {
		EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Luffy Monekey.D", "p01", 30000, 0);
		double salarioEsperado = 0;
		double salarioEmpleadoAsalariado = empleadoPorHoras.calcularSalario();
		assertEquals(salarioEsperado, salarioEmpleadoAsalariado);
	}

}
