import java.util.Scanner;

public class AjoutFerroviaire extends Ajout {

	public CompagnieFeroviaire executeAjoutCompagnie() {
		System.out.println("Veuillez entrer un ID pour la compagnie feroviaire");
		Scanner scanner = new Scanner(System.in);
		String id = scanner.nextLine();
		CompagnieFeroviaire compagnie = new CompagnieFeroviaire(id);
		scanner.close();
		return compagnie;
	}

	public Train executeAjoutVehicule() {
		System.out.println("Veuillez entrer un ID pour le train ");
		Scanner scanner = new Scanner(System.in);
		String id = scanner.nextLine();
		Train train = new Train(id);
		scanner.close();
		return train;
	}

	public Gare executeAjoutInfrastructure() {
		System.out.println("Veuillez entrer un ID pour la gare");
		Scanner scanner = new Scanner(System.in);
		String id = scanner.nextLine();
		System.out.println("Veuillez entrer une ville pour la gare");
		String ville = scanner.nextLine();
		Gare gare = new Gare(ville, id);
		scanner.close();
		return gare;
	}

	public Itineraire executeAjoutDepart() {
		// TODO - implement AjoutFerroviaire.executeAjoutDepart
		throw new UnsupportedOperationException();
	}

}