package br.edu.faeterjrio.garcom;

import java.util.ArrayList;

import br.edu.faeterjrio.garcom.Garcom;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Garcom> lista = new ArrayList<Garcom>();
		Garcom prototipoGarcom = new Garcom();
		Garcom garcom1 = new Garcom("Fulano", 25, "994887701", 4, 1045);
		Garcom garcom2 = new Garcom("Ciclano", 22, "993045577", 2, 1045);
		lista.add(garcom1);
		lista.add(garcom2);
		for (Garcom garc : lista) {
			System.out.println(garc.toString());
		}
	}

}
