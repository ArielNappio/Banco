package ar.edu.unlam.dominio;

public class CuentaCorriente extends Cuenta {

	private Double descubierto;
	private Cuenta cuentas;

	public CuentaCorriente(Integer cbu, double saldo, Usuarios propietario, Double descubierto, Cuenta cuenta) {
		super(cbu, descubierto, propietario);
		this.descubierto = descubierto;
		this.cuentas = cuenta;
	}

	public Double CalcularAdicional(Double monto) {
		Double adicional = monto * 0.05;
		return adicional;
	}

	@Override
	public Double extraerDinero(Double monto) {
		Double extraido = 0.0;
		Double limiteExtraible = this.getSaldo() + descubierto;
		if (monto != 0 && monto < limiteExtraible) {
			// cuentas.setSaldo(cuentas.getSaldo() - monto - this.CalcularAdicional(monto));
			extraido = this.getSaldo() - monto - this.CalcularAdicional(monto);
		}
		return extraido;
	}

}
