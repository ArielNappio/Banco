package ar.edu.unlam.dominio;

import java.util.ArrayList;

public class Cuenta {

	private CuentaCajaAhorro cuentaCajaAhorro;
	private CuentaCorriente cuentaCorriente;
	private CuentaSueldo cuentaSueldo;
	
	private Integer cbu;
	private Double saldo;
	private Usuarios proprietario;
	private ArrayList<ClienteVips> vip;

	public Cuenta(Integer cbu, Double saldo, Usuarios proprietario) {
		this.cbu = cbu;
		this.saldo = saldo;
		this.proprietario = proprietario;
		this.vip = new ArrayList<>();
	}

	public Double extraerDinero(Double monto) {
		Double retorno = 0.0;
		if (saldo >= 0) {
			retorno = saldo -= monto;

		}
		return retorno;
	}

	public Double depositar(Double monto) {
		Double deposito = 0.0;
		if (monto >= 0 && saldo >= 0) {
			deposito = saldo + monto;
		}
		return deposito;
	}

	public CuentaCajaAhorro getCuentaCajaAhorro() {
		return cuentaCajaAhorro;
	}

	public void setCuentaCajaAhorro(CuentaCajaAhorro cuentaCajaAhorro) {
		this.cuentaCajaAhorro = cuentaCajaAhorro;
	}

	public CuentaCorriente getCuentaCorriente() {
		return cuentaCorriente;
	}

	public void setCuentaCorriente(CuentaCorriente cuentaCorriente) {
		this.cuentaCorriente = cuentaCorriente;
	}

	public CuentaSueldo getCuentaSueldo() {
		return cuentaSueldo;
	}

	public void setCuentaSueldo(CuentaSueldo cuentaSueldo) {
		this.cuentaSueldo = cuentaSueldo;
	}

	public Integer getCbu() {
		return cbu;
	}

	public void setCbu(Integer cbu) {
		this.cbu = cbu;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Usuarios getProprietario() {
		return proprietario;
	}

	public void setProprietario(Usuarios proprietario) {
		this.proprietario = proprietario;
	}

}
