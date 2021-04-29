public abstract class Modifier extends Commande {

	/**
	 * 
	 * @param id
	 */
	public abstract void executeModifierCompagnie(String id);

	public abstract void executeModifierDepart();

	public abstract void executeModifierInfrastructure();

	public abstract void executeModifierVehicule();

}