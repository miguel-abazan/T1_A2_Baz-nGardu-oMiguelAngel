import java.io.*;
import java.util.Scanner;

class TDACadenaEspecialConString{
	private String cadena; 
	
	public String getCadena() {
		return cadena;
	}//get
	public void setCadena(String cadena) {
		this.cadena = cadena;
	}//set

	public String invertirCadenaPorletra() {
		String cadInv = "";
		for (int i = this.cadena.length() - 1; i >= 0; i--) {
			cadInv = cadInv + cadena.substring(i, i + 1);
		}
		return cadInv;
	}
	//invertirCadenaPorLetra
	
	public String invertirCadenaPorPalabra() {
		cadena = "";
		String [] particion = cadena.split(" ");
		String parte1 = particion[0];
		String parte2 = particion[1];
		String parte3 = particion[2];

		String [] particiones = {parte2, parte1, parte3};
		return particiones[3];
	}//invertirCadenaPorPalabra
	
	
	public String agregarCaracterEnPosicion(char pos, int car) {
		String palabra = "";
		for (int i = 0; i < this.cadena.length(); i++) {
			if (i == car) {
				palabra = palabra + pos;
			}
			palabra = palabra + this.cadena.substring(i, i + 1);
		}
		return palabra;	
	}//agregarCaracterEnPosicion				
}//Class TDACadenaEspecialConString

public class Prueba {

	public static void main(String[] args) {

		int num = 0;
		//=============================================================
		
		
		TDACadenaEspecialConString td1 = new TDACadenaEspecialConString();
		td1.setCadena("Hola Mundo");
		
		
		td1.invertirCadenaPorletra();
		
		
		
		
	}//main
}//class