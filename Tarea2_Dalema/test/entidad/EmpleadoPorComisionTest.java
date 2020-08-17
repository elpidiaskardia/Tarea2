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
	 * pago base positivo y suma de las horas trabajadas igual a 42 en la semana. Si
	 * tiene mas de 40 horas se da un 5% adicional del valor total de las ventas
	 * vendidas en la semana()
	 */
	@Test
	void calcularSalarioConMasCuarentaHorasPagoPositivoTest() {
		EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Sasuke Ushiha", "p10", 400000);
		double salarioEsperado = 4000000;
		double salarioEmpleadoAsalariado = empleadoAsalariado.calcularSalario();
		assertEquals(salarioEsperado, salarioEmpleadoAsalariado);

	}

}
