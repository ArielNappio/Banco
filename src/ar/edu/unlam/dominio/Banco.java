package ar.edu.unlam.dominio;

import java.util.ArrayList;

public class Banco {

	private ArrayList<Usuarios> usuario;
	private ArrayList<Cuenta> cuentas;
		private ArrayList<ClienteVips> vip;

	public Banco() {
		this.usuario = new ArrayList<Usuarios>();
		this.cuentas = new ArrayList<Cuenta>();
		this.vip = new ArrayList<ClienteVips>();
	}

	public Boolean agregarUsuario(Usuarios nuevoUsuario) {
		boolean retorno = false;
		if (this.usuario.add(nuevoUsuario)) {
			usuario.add(nuevoUsuario);
			retorno = true;
		}
		return retorno;
	}

	public Boolean agregarCuenta(Cuenta nuevaCuenta) {
		boolean retorno = false;
		if (this.cuentas.add(nuevaCuenta)) {
			cuentas.add(nuevaCuenta);
			retorno = true;
		}
		return retorno;
	}

	public Boolean agregarCuentaConVIP(ClienteVips nuevoVip) {
		boolean retorno = false;

		if (this.vip.add(nuevoVip)) {
			vip.add(nuevoVip);
			retorno = true;
		}

		return retorno;
	}// !cuentas.add(nuevaCuenta)

	

}
