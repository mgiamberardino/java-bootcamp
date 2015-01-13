package topic0.point2;

/*
 * This is a basic building, a house
 * A house have a number rooms, a number of bathrooms, and a number of floors.
 * Also have an amount of m2 that the house covers
 * @author Mauro J Giamberardino
 */

public class House {

	/*
	 * Number of rooms.
	 */
	private Integer nRooms;

	/*
	 * Number of bathrooms.
	 */
	private Integer nBathRooms;

	/*
	 * Number of floors
	 */
	private Integer nFloors;

	/*
	 * Amount of m2
	 */
	private Long m2;

	/*
	 * If have garage
	 */
	private boolean garage;

	/*
	 * Contructor
	 */
	public House() {
		super();
	}

	/*
	 * Getter of the number of rooms
	 * 
	 * @return number of rooms of the house
	 */
	public Integer getnRooms() {
		return nRooms;
	}

	/*
	 * Setter of the number of rooms
	 * 
	 * @param number of rooms of the house
	 */
	public void setnRooms(Integer nRooms) {
		this.nRooms = nRooms;
	}

	/*
	 * Getter of the number of bathrooms
	 * 
	 * @return number of bathrooms of the house
	 */
	public Integer getnBathRooms() {
		return nBathRooms;
	}

	/*
	 * Getter of the number of bathrooms
	 * 
	 * @param number of bathrooms of the house
	 */
	public void setnBathRooms(Integer nBathRooms) {
		this.nBathRooms = nBathRooms;
	}

	/*
	 * Getter of the number of floors
	 * 
	 * @return number of floors of the house
	 */
	public Integer getnFloors() {
		return nFloors;
	}

	/*
	 * Setter of the number of floors
	 * 
	 * @param number of floors of the house
	 */
	public void setnFloors(Integer nFloors) {
		this.nFloors = nFloors;
	}

	/*
	 * Getter of the amount of m2
	 * 
	 * @return amount of m2 of the house
	 */
	public Long getM2() {
		return m2;
	}

	/*
	 * Setter of the amount of m2
	 * 
	 * @param amount of m2 of the house
	 */
	public void setM2(Long m2) {
		this.m2 = m2;
	}

	/*
	 * If the house have garage
	 * 
	 * @return true if the house have garage
	 */
	public boolean haveGarage() {
		return garage;
	}

	/*
	 * Set if the house have garage
	 * 
	 * @param true if the house have garage
	 */
	public void setGarage(boolean garage) {
		this.garage = garage;
	}

}
