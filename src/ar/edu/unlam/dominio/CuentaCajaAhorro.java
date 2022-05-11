package ar.edu.unlam.dominio;

public class CuentaCajaAhorro extends Cuenta {

	private Cuenta cuenta;

	public CuentaCajaAhorro(Integer cbu, Double saldo, Usuarios proprietario, Cuenta cuenta) {
		super(cbu, saldo, proprietario);
		this.cuenta = cuenta;
	}

	@Override
	public Double extraerDinero(Double monto) {
		Integer contador = 0;
		Double extraccion = 0.0;

		if (contador >= 5 && this.getSaldo() <= 0 && this.getSaldo() <= monto) {
			extraccion = ((this.getSaldo() - monto) - 6.0);

		}
		if (contador <= 5 && this.getSaldo() <= 0 && this.getSaldo() <= monto) {
			extraccion = (this.getSaldo() - monto);

		} else {
			extraccion = ((this.getSaldo() - monto) - 6);
		}
		contador++;
		return extraccion;

	}

	public Double contador(Double monto) {
		Integer contador = 0;
		Double extraccion = 0.0;

		if (this.getSaldo() >= 0 && contador <= 5 && monto < 0) {
			contador++;
			extraccion = this.getSaldo();
		}

		if (this.getSaldo() >= 0 && contador >= 5 && monto < 0) {
			extraccion = ((this.getSaldo() - monto) - 6.0);

		}
		return extraccion;

	}

}
