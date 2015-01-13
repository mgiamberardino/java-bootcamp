package topic0.point2;

/*
 * This is a Builder Interface based on the Creational Pattern "Builder Pattern".
 * 
 */
public interface HouseBuilder {

	/*
	 * Build the rooms of the house.
	 */
	public void buildRooms();

	/*
	 * Build the bathrooms of the house.
	 */
	public void buildBathRooms();

	/*
	 * Build the floors of the house.
	 */
	public void buildFloors();

	/*
	 * Build the garage of the house
	 */
	public void buildGarage();

	/*
	 * Calculates the m2 of the house.
	 */
	public void calculateM2();

	/*
	 * Once all the parts are finished this method returns the house builded.
	 */
	public House buildHouse();

}
