import java.util.ArrayList;
import java.util.Scanner;

public class MenuClient implements Menu {

	private ArrayList<String> ListeMenu;
	
	public static void menuTypeVoyage() {
		System.out.println("Quel type de voyage voulez-vous?");
		System.out.println("   1 - Voyage en avion ");
		System.out.println("   2 - Voyage en train");
		System.out.println("   3 - Voyage en bateau");
		System.out.println("   4 - Retour");
		
		
	}

	public static void menuClient() {
		System.out.println("Que voulez vous faire? :");
		System.out.println("   1 - Rechercher un voyage ");
		System.out.println("   2 - Reserver un voyage");
		System.out.println("   3 - Payer un voyage");
		System.out.println("   4 - Retour");
		Scanner scanchoice = new Scanner(System.in);
		System.out.println();
		int choiceentry = scanchoice.nextInt();
		if(choiceentry == 1) {
			//RECHERCHER 
			menuTypeVoyage();
			Scanner scanRecherche = new Scanner(System.in);
			System.out.println();
			int choixRecherche = scanRecherche.nextInt();
			
			//AVION & TRAIN
				System.out.println("De quel endroit souhaitez-vous partir ? ");
				String origine = scanRecherche.nextLine();
				
				if(choixRecherche == 1 || choixRecherche==2) {
					System.out.println("A quel endroit souhaitez-vous arriver ? ");
					String arriver = scanRecherche.nextLine();
				}
				System.out.println("A partir de quelle date souhaitez-vous partir ? ");
				String dateDepart = scanRecherche.nextLine();
				System.out.println("Dans quelle classe souhaitez-vous etre place? ");
				String classe = scanRecherche.nextLine();
				
				scanRecherche.close();
				//CREER FONCTION QUI RECHERCHER AVEC LES CRITERES EN ATTRIBUTS
			}
			else if(choiceentry == 2) {
			//RESERVER
			Scanner scanReserver = new Scanner(System.in);

			menuTypeVoyage();
			System.out.println();
			int choixReservation = scanReserver.nextInt();
			if(choixReservation ==1) {//AVION
			System.out.println("Quel est le numero du vol que vous voulez reserver?");
			String noVol = scanReserver.nextLine();
			System.out.println("Preferez-vous un siege cote fenetre ou cote aile?");
			String aileFenetre = scanReserver.nextLine();
			System.out.println("Voici votre numero de reservation : "/* + print du num */);

			}
			else if(choixReservation ==2) {//TRAIN
				System.out.println("Quel est le numero du vol que vous voulez reserver?");
				String noTrain = scanReserver.nextLine();
				System.out.println("Preferez-vous un siege cote fenetre ou cote aile?");
				String aileFenetre = scanReserver.nextLine();
				System.out.println("Voici votre numero de reservation : "/* + print du num */);

				
				}
			else if(choixReservation ==3) {//BATEAU
				System.out.println("Quel est le numero de la croisiere que vous voulez reserver?");
				String noCroisiere = scanReserver.nextLine();
				System.out.println("Voici votre numero de reservation : "/* + print du num */);
				scanReserver.close();
				}
			
			//CREER UNE RESERVATION AVEC LES INFO EN ATTRIBUTS

		
		}else if(choiceentry == 3) {
			//PAYER
			Scanner scanPayer = new Scanner(System.in);
			System.out.println("Quel est le numero du reservation que vous souhaitez payer?");
			String noReservation = scanPayer.nextLine();
			System.out.println("Quel est votre nom?");
			String nom = scanPayer.nextLine();
			System.out.println("Quel est votre prenom?");
			String prenom = scanPayer.nextLine();
			System.out.println("Quel est votre couriel?");
			String couriel = scanPayer.nextLine();
			System.out.println("Quel est votre noCarteCredit");
			int infoCarte = scanPayer.nextInt();

			
		//FAIRE LE PAIEMENT
			
		}else if(choiceentry == 4) {
			MenuLogin.menuEntrer();
		}
	}

	

}