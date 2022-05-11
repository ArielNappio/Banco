package ar.edu.unlam.dominio;

public class Usuarios {
	private String nombre;
	private Integer dni;
	private Cuenta cuentas;

	public Usuarios(String nombre, Integer dni, Cuenta cuentas) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.cuentas = cuentas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Cuenta getCuentas() {
		return cuentas;
	}

	public void setCuentas(Cuenta cuentas) {
		this.cuentas = cuentas;
	}

}
