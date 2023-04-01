package n1exercici1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		menu();
		
	}
	public static String escollirComanda(String missatge, Scanner sc) {
		System.out.println(missatge);
		String comanda = sc.nextLine();
		return comanda;
		}
	
	public static void menu() {
		try (Scanner input = new Scanner(System.in)) {
			Undo historial = Undo.getInstancia();
			boolean sortir = false;
			String comanda;
			
			do {
				comanda = escollirComanda("Què desitges realitzar?:\n"
						+ "Escriu <Introduir> per introduir una comanda\n"
						+ "<Eliminar> per eliminar la última comanda\n"
						+ "<Visualitzar> per visualitzar totes les comandes\n"
						+ "Sortir", input);
				switch(comanda.toLowerCase()) {
				case("introduir"):
					System.out.println("Introdueix la comanda a introduir");
					comanda = input.nextLine();
					historial.addComanda(comanda);
					break;
				case("eliminar"):
					historial.deleteLastComanda();
					break;
				case("visualitzar"):
					historial.lookComandes();
					break;
				case("sortir"):
					sortir = true;
					System.out.println("Sortint");
					break;
					default: System.out.println("Error, tria una altra operació");
				}
			}
			while(!sortir);
		}
	}
}
