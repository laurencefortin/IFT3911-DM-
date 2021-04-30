import java.time.LocalDate;
import java.time.LocalTime;

public class Vol extends AbstractDepart {

	private Aeroport EndroitArrivee;

	public Vol(String id, Aeroport EndroitDepart, Aeroport EndroitArrivee, LocalDate DateDepart, LocalDate DateArrivee,
			LocalTime heureDepart, LocalTime heureArrivee) {
		super(id, EndroitDepart, DateDepart, DateArrivee, heureDepart, heureArrivee);
		// TODO Auto-generated constructor stub
	}

}