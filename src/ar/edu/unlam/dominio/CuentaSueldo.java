package ar.edu.unlam.dominio;

public class CuentaSueldo extends Cuenta {

	private Cuenta cuentas;
	// private Integer cbu;
	// private Double saldo;

	public CuentaSueldo(Integer cbu, Double saldo, Usuarios proprietario, Cuenta cuentas) {
		super(cbu, saldo, proprietario);

	}

	@Override
	public Double extraerDinero(Double monto) {
		Double extraccion = 0.0;

		if (this.getSaldo() >= 0 && this.getSaldo() >= monto) {
			extraccion = (this.getSaldo() - monto);

		}
		return extraccion;
	}

	public Cuenta getCuentas() {
		return cuentas;
	}

	public void setCuentas(Cuenta cuentas) {
		this.cuentas = cuentas;
	}

	/*
	 * boolean retorno = false;
	 * 
	 * if (saldo >= 0 && saldo >= monto) { saldo -= monto; retorno = true; } return
	 * retorno; }
	 */

}
