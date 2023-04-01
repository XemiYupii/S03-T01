package n1exercici1;

import java.util.ArrayList;
import java.util.List;

public class Undo {
	
	private static Undo instance = null;
	private List<String>comandes;
	
	private Undo() {
		comandes = new ArrayList<>();
	}
	
	public static Undo getInstancia() {
		if(instance == null)
			instance = new Undo();
		return instance;
	}
	
	public void addComanda(String comanda) {
		comandes.add(comanda);
		System.out.println("Comanda introduïda");
	}
	
	public void deleteLastComanda() {
		if(!comandes.isEmpty()) {
		comandes.remove(comandes.size() - 1);
		System.out.println("Última comanda eliminada");
		}
	}
		
	public void lookComandes(){
		comandes.forEach(System.out::println);
	}
}
