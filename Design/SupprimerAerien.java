import java.util.Scanner;

public class SupprimerAerien extends Supprimer {

	public void executeSupprimerCompagnie()) {
		System.out.println("Veuillez entrer l'id de la compagnie à supprimer");
		Scanner scanner = new Scanner(System.in);
		String id = scanner.nextLine();
		CompagnieAerienne compagnie = new CompagnieAerienne(id);
		scanner.close();
		return compagnie;
	}

	public void executeSupprimerVehicule() {
		// TODO - implement SupprimerAerien.executeSupprimerVehicule
		throw new UnsupportedOperationException();
	}

	public void executeSupprimerDepart() {
		// TODO - implement SupprimerAerien.executeSupprimerDepart
		throw new UnsupportedOperationException();
	}

	public void executeSupprimerInfrastructure() {
		// TODO - implement SupprimerAerien.executeSupprimerInfrastructure
		throw new UnsupportedOperationException();
	}

}