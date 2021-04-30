import java.util.ArrayList;
import java.util.Scanner;


public class MenuLogin implements Menu {

	private ArrayList<String> ListeMenu;

	public static void menuEntrer() {
		System.out.println("Etes vous un client ou un administrateur? :");
		System.out.println("1 - Client");
		System.out.println("2 - Administrateur");
		System.out.println("3 - Sortie");
		Scanner scanchoice = new Scanner(System.in);
		System.out.println();
		int choiceentry = scanchoice.nextInt();
		if(choiceentry == 1) {
			MenuClient.menuClient();
		}else if(choiceentry == 2) {
			MenuAdmin.menuAdmin();
		}
	}
}