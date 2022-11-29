package Exe_Internet;

public class IngressoVIP extends Ingresso {
	
	private float valorAdicional;
	
	public IngressoVIP (float valorAdicional, float valor) {
		super(valor);
		this.setValorAdicional(valorAdicional);
		this.setValor(getValor());
	}
	
	float valorTotal;
	
	public float valorIngresso() {	
		valorTotal = valorAdicional + getValor();
		return valorTotal;
	}
	public String toString() {
		return("O valor do ingresso VIP é: "+ valorIngresso());
	}

	private void setValorAdicional(float valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	public float getValorAdicional() {
		return valorAdicional;
	}
	
}
