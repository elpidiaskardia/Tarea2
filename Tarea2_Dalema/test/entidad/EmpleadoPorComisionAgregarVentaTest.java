package entidad;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import control.CompañiaException;

/**
 * pruebas para el metodo agregar venta de un empleado por comision
 * 
 * @author danna
 *
 */
class EmpleadoPorComisionAgregarVentaTest {
	/**
	 * venta con precio del producto positivo y cantidad mayor a 0
	 */
	@Test
	void agregarVentaConValorPositivoYCantidadPositiva() throws CompañiaException {
		EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Eiichiro oda", "p33", 400000, 0);
		boolean adicionVenta = empleadoPorComision.agregarVenta(100000, 1, "Super nintendo");
		assertTrue(adicionVenta);
	}

	/**
	 * venta con valor negatico y cantidad positiva, se espera una excepcion
	 */
	@Test
	void agregarVentaConValorNegativoYCantidadPositiva() throws CompañiaException {
		EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Eiichiro oda", "p33", 400000, 0);
		assertThrows(CompañiaException.class, () -> empleadoPorComision.agregarVenta(-200000, 2, "Nintendo 64"));
	}

	/**
	 * venta con valor positivo pero cantidad negativa, se espera una excepcion
	 */
	@Test
	void agregarVentaConValorNegativoYCantidadNegativa() throws CompañiaException {
		EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Eiichiro oda", "p33", 400000, 0);
		assertThrows(CompañiaException.class, () -> empleadoPorComision.agregarVenta(60000, -3, "Gameboy Advance"));
	}

	/*
	 * vanta con valor mayor a 0 per sin cantidad, se espera una excepcion
	 * 
	 */
	@Test
	void agregarVentaSinCantidad() throws CompañiaException {
		EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Eiichiro oda", "p33", 400000, 0);
		assertThrows(CompañiaException.class, () -> empleadoPorComision.agregarVenta(3000000, 0, "Play Station 5"));

	}

}
