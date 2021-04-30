import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Croisiere extends AbstractDepart {

	private ArrayList<Port> ListePort;
	public Croisiere(String id, AbstractInfrastructure EndroitDepart, LocalDate DateDepart, LocalDate DateArrivee,
			LocalTime heureDepart, LocalTime heureArrivee) {
		super(id, EndroitDepart, DateDepart, DateArrivee, heureDepart, heureArrivee);
		ListePort = new ArrayList<Port>();
	}

}