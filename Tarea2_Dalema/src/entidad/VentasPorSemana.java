package entidad;

/**
 * 
 * @author danna
 * @version 1.0 clase de las ventas hechas por semana por el empleado por
 *          comision
 */
public class VentasPorSemana {
	private String nombreArticulo;
	private int cantidad;
	private double valorUnidad;

	/**
	 * constructor de ventas por semana
	 * 
	 * @param nombreArticulo nombre del item o articulo
	 * @param cantidad       cantidad del articulo a vender
	 * @param valorPorUnidad valor de una unidad del articulo seleccionado
	 */
	VentasPorSemana(String nombreArticulo, int cantidad, double valorPorUnidad) {
		this.nombreArticulo = nombreArticulo;
		this.cantidad = cantidad;
		this.valorUnidad = valorPorUnidad;
	}

	/**
	 * caclcula el valor total de la venta de un articulo en especifico
	 * 
	 * @return el valor total de la venta de este articulo
	 */
	public double calcularValorTotalVenta() {
		return 0;
	}

}
