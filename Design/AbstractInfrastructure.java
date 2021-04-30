import java.util.ArrayList;

public abstract class AbstractInfrastructure {

	private ArrayList<AbstractDepart> ListeVoyage;
	private String Ville;
	private String id;
	
	public AbstractInfrastructure(String ville, String id)
	{
		this.Ville = ville;
		this.id = id;
		ListeVoyage = new ArrayList<AbstractDepart>();
	}
}