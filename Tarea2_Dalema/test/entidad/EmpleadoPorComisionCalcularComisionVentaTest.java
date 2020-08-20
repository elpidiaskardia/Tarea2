package entidad;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * pruebas para el metodo calcularComisionVenta si tiene ventas realizadas se
 * saca el 5% del valor total de las ventas y este sera la comision para el
 * empleado contratado por comision
 * 
 * @author Danna Vanessa Rubio
 *
 */
class EmpleadoPorComisionCalcularComisionVentaTest {

	/**
	 * se calcula la comision de lasveentas realizadas, este devuelve el 5% del
	 * total de las ventas hechas en la semana (500.000) se espera una comision de
	 * 25.000
	 */
	@Test
	void calcularComisionVentaConVentasTest() {
		EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Eiichiro oda", "p33", 400000, 500000);
		double comisionEsperada = 25000;
		double comisionVenta = empleadoPorComision.calcularComisionVenta();
		assertEquals(comisionEsperada, comisionVenta);

	}

	/**
	 * no se tieenen ventas realizadas, por lo tanto la comision debe ser 0
	 */
	@Test
	void calcularComisionVentaSinVentasTest() {
		EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Hiromu Arakawa", "p24", 400000, 0);
		double comisionEsperada = 0;
		double comisionVenta = empleadoPorComision.calcularComisionVenta();
		assertEquals(comisionEsperada, comisionVenta);

	}

}
