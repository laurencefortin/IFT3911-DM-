import java.time.LocalDate;
import java.time.LocalTime;

public abstract class AbstractDepart {

	private String id;
	private AbstractInfrastructure EndroitDepart;
	private LocalDate DateDepart;
	private LocalDate DateArrivee;
	private LocalTime heureDepart;
	private LocalTime heureArrivee;
	
	public AbstractDepart(String id, AbstractInfrastructure EndroitDepart, LocalDate DateDepart, LocalDate DateArrivee, LocalTime heureDepart, LocalTime heureArrivee)
	{
		this.id = id;
		this.EndroitDepart = EndroitDepart;
		this.DateDepart = DateDepart;
		this.DateArrivee = DateArrivee;
		this.heureArrivee = heureArrivee;
		this.heureDepart = heureDepart;
	}

}