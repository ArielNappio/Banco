package ar.edu.unlam.dominio;

public class ClienteVips extends Cuenta {

	public ClienteVips(Integer cbu, Double saldo, Usuarios proprietario) {
		super(cbu, saldo, proprietario);
	}

	public boolean verificarVip(ClienteVips vippp) {
		boolean retorno = false;
		if (this.getSaldo() > 1000000.0) {
			retorno = true;
		}

		return retorno;

	}
}
