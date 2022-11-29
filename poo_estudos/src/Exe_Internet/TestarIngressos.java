package Exe_Internet;

import java.util.ArrayList;

public class TestarIngressos {

	//ArrayList<Ingresso> showLuisaSonza = new ArrayList<>();

	public static void main(String[] args) {
		
	Ingresso ing1 = new Ingresso(255);
	Ingresso ing2 = new Ingresso(255);
	Ingresso ing3 = new Ingresso(100);
	
	IngressoVIP ingVIP1 = new IngressoVIP(300, 255);
	
	//Testar o toString do ingresso VIP
	System.out.println(ingVIP1.toString());
	
	//Testar o toString do ingresso
	System.out.println(ing1.toString());
	
	//Testar o atributo do ingresso
	System.out.println("O valor do ingresso é: "+ing3.getValor());
	
	}

}
