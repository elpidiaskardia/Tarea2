package entidad;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Pruebas para el metodo calcularSalario de un empleado contratado por comision
 * 
 * @author danna
 *
 */
class EmpleadoPorComisionTest {

	/**
	 * pago base positivo 400.000 y se da un 5% adicional del valor total de las
	 * ventas vendidas en la semana(500.000), se espera un saldo de 425.000
	 */
	@Test
	void calcularSalarioConMasCuarentaHorasPagoPositivoTest() {
		EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Eiichiro oda", "p33", 400000, 500000);
		double salarioEsperado = 425000;
		double salarioEmpleadoPorComision = empleadoPorComision.calcularSalario();
		assertEquals(salarioEsperado, salarioEmpleadoPorComision);

	}

	/**
	 * el pago base es positivo 400.000 y no vendio nada en la semana, se espera
	 * 400.000 del salario
	 */
	@Test
	void calcularSalarioSinVentasPagoPositivoTest() {
		EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Hiromu Arakawa", "p24", 400000, 0);
		double salarioEsperado = 400000;
		double salarioEmpleadoPorComision = empleadoPorComision.calcularSalario();
		assertEquals(salarioEsperado, salarioEmpleadoPorComision);

	}

}
