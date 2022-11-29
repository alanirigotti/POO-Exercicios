package Exe_Internet;

public class Ingresso {
	
	private float valor;
	
	public Ingresso(float d ) {
		this.setValor(d);
	}
	
	public String toString() {
		return("O ingresso custa: R$ "+ getValor());
	}
	

	
	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
	
	

}
