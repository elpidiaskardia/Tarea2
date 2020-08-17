package entidad;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import control.CompañiaException;

/**
 * pruebas para el metodo calcularSalario para un empleado asalariado
 * 
 * @author danna
 *
 */
class EmpleadoAsalariadoTest {
	/**
	 * el pago base del empleado es de 400.000
	 */
	@Test
	void calcularSalarioConPagoPositivotest() throws CompañiaException {
		EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Sasuke Ushiha", "p10", 400000);
		double salarioEsperado = 4000000;
		double salarioEmpleadoAsalariado = empleadoAsalariado.calcularSalario();
		assertEquals(salarioEsperado, salarioEmpleadoAsalariado);
	}

	/**
	 * El pago base ingresado es negativo -400.000
	 */
	@Test
	void calcularSalarioConPagoNegativoTest() throws CompañiaException {
		EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Bob Espon", "p11", -400000);
		assertThrows(CompañiaException.class, () -> empleadoAsalariado.calcularSalario());
	}

	/**
	 * El pago base es 0
	 */
	void calcularSalarioSinPagoBaseTest() throws CompañiaException {
		EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Nikola Alset", "p30", 0);
		double salarioEsperado = 0;
		double salarioEmpleadoAsalariado = empleadoAsalariado.calcularSalario();
		assertEquals(salarioEsperado, salarioEmpleadoAsalariado);

	}

}
