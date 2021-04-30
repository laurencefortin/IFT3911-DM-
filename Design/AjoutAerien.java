import java.util.Scanner;

public class AjoutAerien extends Ajout {

	public CompagnieAerienne executeAjoutCompagnie() {
		System.out.println("Veuillez entrer un ID pour la compagnie aérienne");
		Scanner scanner = new Scanner(System.in);
		String id = scanner.nextLine();
		CompagnieAerienne compagnie = new CompagnieAerienne(id);
		scanner.close();
		return compagnie;
	}

	public Avion executeAjoutVehicule() {
		System.out.println("Veuillez entrer un ID pour l'avion ");
		Scanner scanner = new Scanner(System.in);
		String id = scanner.nextLine();
		Avion avion = new Avion(id);
		scanner.close();
		return avion;
	}

	public Aeroport executeAjoutInfrastructure() {
		System.out.println("Veuillez entrer un ID pour l'aéroport");
		Scanner scanner = new Scanner(System.in);
		String id = scanner.nextLine();
		System.out.println("Veuillez entrer une ville pour l'aéroport");
		String ville = scanner.nextLine();
		Aeroport aeroport = new Aeroport(ville, id);
		scanner.close();
		return aeroport;
	}

	public Vol executeAjoutDepart() {
		
		// TODO - implement AjoutFerroviaire.executeAjoutDepart
				throw new UnsupportedOperationException();
		/*System.out.println("Veuillez choisir un aéroport de départ");
		Scanner scanner = new Scanner(System.in);
		String id = scanner.nextLine();
		Vol compagnie = new CompagnieAerienne(id);
		scanner.close();
		return compagnie;*/
	}
    
}