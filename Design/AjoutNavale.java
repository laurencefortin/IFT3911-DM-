import java.util.Scanner;

public class AjoutNavale extends Ajout {

	public CompagnieNavale executeAjoutCompagnie() {
		System.out.println("Veuillez entrer un ID pour la compagnie navale");
		Scanner scanner = new Scanner(System.in);
		String id = scanner.nextLine();
		CompagnieNavale compagnie = new CompagnieNavale(id);
		scanner.close();
		return compagnie;
	}

	public Bateau executeAjoutVehicule() {
		System.out.println("Veuillez entrer un ID pour le bateau ");
		Scanner scanner = new Scanner(System.in);
		String id = scanner.nextLine();
		Bateau bateau = new Bateau(id);
		scanner.close();
		return bateau;
	}

	public Port executeAjoutInfrastructure() {
		System.out.println("Veuillez entrer un ID pour le port");
		Scanner scanner = new Scanner(System.in);
		String id = scanner.nextLine();
		System.out.println("Veuillez entrer une ville pour le port");
		String ville = scanner.nextLine();
		Port port = new Port(ville, id);
		scanner.close();
		return port;
	}

	public Croisiere executeAjoutDepart() {
		// TODO - implement AjoutNavale.executeAjoutDepart
		throw new UnsupportedOperationException();
	}

}