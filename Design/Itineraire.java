import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Itineraire extends AbstractDepart {

	private ArrayList<Gare> ListeGares;
	private Gare EndroitArrivee;
	
	public Itineraire(String id, Gare EndroitDepart, Gare EndroitArrivee, LocalDate DateDepart, LocalDate DateArrivee,
			LocalTime heureDepart, LocalTime heureArrivee) {
		super(id, EndroitDepart, DateDepart, DateArrivee, heureDepart, heureArrivee);
		this.EndroitArrivee = EndroitArrivee;
		ListeGares = new ArrayList<Gare>();
		// TODO Auto-generated constructor stub
	}

}