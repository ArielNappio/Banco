package ar.edu.unlam.dominio;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void queSeCreeUnUsuario() {

		Boolean valorEsperado = true;
		Boolean valorObtenido;

		Banco Santander = new Banco();

		Usuarios Ariel = new Usuarios("ariel", 22, null);

		valorObtenido = Santander.agregarUsuario(Ariel);

		assertEquals(valorEsperado, valorObtenido);
	}

	@org.junit.Test
	public void queSeCreeUnaCuenta() {

		Boolean valorEsperado = true;
		Boolean valorObtenido;

		Banco Santander = new Banco();

		Usuarios Ariel = new Usuarios("ariel", 22, null);

		Cuenta cuentaDeAriel = new Cuenta(222, 300.0, Ariel);

		valorObtenido = Santander.agregarCuenta(cuentaDeAriel);

		assertEquals(valorEsperado, valorObtenido);
	}

	@org.junit.Test
	public void queSeCreeUnaCuentaSueldo() {
		Banco Santander = new Banco();

		Usuarios Ariel = new Usuarios("ariel", 22, null);
		// Cuenta cuentaDeAriel = new Cuenta(222, 300.0, Ariel);
		// CuentaSueldo cuentaDeSueldo = new CuentaSueldo(222, 300.0, Ariel,
		// cuentaDeAriel);

		Cuenta cuentaDeSueldo = new CuentaSueldo(222, 300.0, Ariel, null);

		assertNotNull(cuentaDeSueldo);
	}

	@org.junit.Test
	public void queSeExtraigaDineroDeUnaCuentaSueldo() {

		Double dineroEsperado = 100.0;
		Double dineroObtenido = 0.0;

		Banco Santander = new Banco();
		Usuarios Ariel = new Usuarios("ariel", 22, null);

		// Cuenta cuentaDeAriel = new Cuenta(222, 300.0, Ariel);

		// CuentaSueldo cuentaDeSueldo = new CuentaSueldo(222, 300.0, Ariel,
		// cuentaDeAriel);

		Cuenta cuentaDeSueldo = new CuentaSueldo(222, 300.0, Ariel, null);

		dineroObtenido = cuentaDeSueldo.extraerDinero(200.0);

		assertEquals(dineroEsperado, dineroObtenido);

	}

	@org.junit.Test
	public void queSeCreeUnaCajaDeAhorros() {
		Banco Santander = new Banco();

		Usuarios Ariel = new Usuarios("ariel", 22, null);
		Cuenta cuentaDeAriel = new Cuenta(222, 300.0, Ariel);

		CuentaCajaAhorro cuentaCajaAhorro = new CuentaCajaAhorro(222, 20.0, Ariel, cuentaDeAriel);

		assertNotNull(cuentaCajaAhorro);
	}

	@org.junit.Test
	public void queSeExtraigaDineroDeUnaCajaDeAhorros() {

		Double dineroEsperado = 194.0;
		Double dineroObtenido;

		Banco Santander = new Banco();
		Usuarios Ariel = new Usuarios("ariel", 22, null);

		Cuenta cuentaDeAriel = new Cuenta(222, 300.0, Ariel);

		CuentaCajaAhorro cuentaCajaAhorro = new CuentaCajaAhorro(222, 200.0, Ariel, cuentaDeAriel);

		// 200 - 6 = 194

		dineroObtenido = cuentaCajaAhorro.extraerDinero(0.0);
		assertEquals(dineroEsperado, dineroObtenido);

	}

	@org.junit.Test
	public void queSeCreeUnaCuentaCorriente() {

		Banco Santander = new Banco();

		Usuarios Ariel = new Usuarios("ariel", 22, null);

		Cuenta cuentaDeAriel = new Cuenta(222, 300.0, Ariel);
		CuentaCorriente cuentaCorriente = new CuentaCorriente(222, 300.0, Ariel, 20.0, cuentaDeAriel);

		assertNotNull(cuentaCorriente);
	}

	@org.junit.Test
	public void queSeDespositeDeUnaCuentaCorriente() {

		// no hacer

		Double deuda = 105.0;
		Double valorObtenido = 0.0;

		Banco Santander = new Banco();

		Usuarios Ariel = new Usuarios("ariel", 22, null);

		Cuenta cuentaDeAriel = new Cuenta(222, 100.0, Ariel);

		CuentaCorriente cuentaCorriente = new CuentaCorriente(222, 100.0, Ariel, 10.0, cuentaDeAriel);

		valorObtenido = cuentaCorriente.extraerDinero(200.0);

		assertEquals(deuda, valorObtenido);

	}

	@org.junit.Test
	public void queSeCreeUnaCuentaVip() {

		Boolean valorEsperado = true;
		Boolean valorObtenido = false;

		Banco Santander = new Banco();

		Usuarios Ariel = new Usuarios("ariel", 22, null);
		Cuenta cuentaAriel = new Cuenta(222, 300000000.0, Ariel);
		ClienteVips vip = new ClienteVips(222, 100000000.0, Ariel);

		valorObtenido = vip.verificarVip(vip);

		assertEquals(valorEsperado, valorObtenido);
	}

}
