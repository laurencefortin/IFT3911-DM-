public abstract class Commande {

	public abstract Compagnie executeAjoutCompagnie();

	public abstract Vehicule executeAjoutVehicule();

	public abstract Depart executeAjoutDepart();

	public abstract Infrastructure executeAjoutInfrastructure();

	public abstract void executeModifierCompagnie();

	public abstract void executeModifierVehicule();

	public abstract void executeModifierDepart();

	public abstract void executeModifierInfrastructure();

	public abstract void executeSupprimerCompagnie();

	public abstract void executeSupprimerVehicule();

	public abstract void executeSupprimerDepart();

	public abstract void executeSupprimerInfrastructure();

	public void undo() {
		// TODO - implement Commande.undo
		throw new UnsupportedOperationException();
	}

}