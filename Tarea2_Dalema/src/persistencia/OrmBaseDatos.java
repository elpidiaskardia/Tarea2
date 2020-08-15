package persistencia;

import java.util.List;

import entidad.Empleado;

public class OrmBaseDatos implements RepositorioEmpleados {

	@Override
	public List<Empleado> consultarEmpleados() {

		return null;
	}

	@Override
	public boolean adicionarEmpleado(Empleado empleado) {

		return false;
	}

	@Override
	public Empleado buscarEmpleado(String identificacion) {

		return null;
	}

	@Override
	public boolean borrarBarco(Empleado empleado) {

		return false;
	}

}
