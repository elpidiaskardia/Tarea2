package entidad;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

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
	void calcularSalarioConPagoPositivotest() {
		EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Sasuke Ushiha", "p10", 400000);
		double salarioEsperado = 4000000;
		double salarioEmpleadoAsalariado = empleadoAsalariado.calcularSalario();
		assertEquals(salarioEsperado, salarioEmpleadoAsalariado);
	}

}
