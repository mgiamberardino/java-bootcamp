package topic0.point2;

/*
 * This is the Director class of the Builder Pattern
 */
public class HouseDirector {
	
	private HouseBuilder builder;
	
	/*
	 * Constructor
	 */
	public HouseDirector(HouseBuilder builder) {
		super();
		this.builder = builder;
	}

	/*
	 * This method implements the process to build the house.
	 * @return house the house builded
	 */
	public House getHouse(){
		builder.buildBathRooms();
		builder.buildFloors();
		builder.buildGarage();
		builder.buildRooms();
		builder.calculateM2();
		return builder.buildHouse();
	}
	
}
