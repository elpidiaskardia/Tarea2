package entidad;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * pruebas para el metodo calcularValorTotalVenta realizado por un empleado
 * contratado por comision
 * 
 * @author danna
 *
 */
class VentasPorSemanaTest {
	/**
	 * el valor del articulo es positivo(100.000) y la cantidad es mayor a 0
	 */
	@Test
	void calcularValorTotalVentaPositivoYCantidadMayorCeroTest() {
		VentasPorSemana ventasSemana = new VentasPorSemana("Super nintendo", 100000, 1);
		double valorTotalEsperado = 100000;
		double valorTotalVenta = ventasSemana.calcularValorTotalVenta();
		assertEquals(valorTotalEsperado, valorTotalVenta);
	}

	/**
	 * el valor del articulo es 80.000 y la cantidad es igual a 20 el valor esperado
	 * de la venta es de 1'600.000
	 */
	@Test
	void calcularValorTotalVentaConCantidadGrandeTest() {
		VentasPorSemana ventasSemana = new VentasPorSemana("Vino Tinto", 80000, 20);
		double valorTotalEsperado = 1600000;
		double valorTotalVenta = ventasSemana.calcularValorTotalVenta();
		assertEquals(valorTotalEsperado, valorTotalVenta);
	}

	/**
	 * El valor del articulo es de 200.000 y la cantidad es igual a 0 el valor
	 * esperado de la venta es 0
	 */
	@Test
	void calcularValorTotalVentaConCantidadIgualACero() {
		VentasPorSemana ventasSemana = new VentasPorSemana("Vino Tinto", 200000, 0);
		double valorTotalEsperado = 0;
		double valorTotalVenta = ventasSemana.calcularValorTotalVenta();
		assertEquals(valorTotalEsperado, valorTotalVenta);
	}
}
