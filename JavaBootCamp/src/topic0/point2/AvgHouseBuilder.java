package topic0.point2;
/*
 * This is a builder implementation of a Builder Pattern. 
 * 
 * This class is a builder of a House. This builder builds an average size house.
 */

public class AvgHouseBuilder implements HouseBuilder {

	/*
	 * House instance to build.
	 */
	House house;
	
	/*
	 * Constructor
	 */
	public AvgHouseBuilder() {
		super();
		house = new House();
	}
	
	@Override
	public House buildHouse() {
		return house;
	}
	
	@Override
	public void buildRooms() {
		house.setnRooms(3);
	}

	@Override
	public void buildBathRooms() {
		house.setnBathRooms(2);		
	}

	@Override
	public void buildFloors() {
		house.setnFloors(2);		
	}

	@Override
	public void buildGarage() {
		house.setGarage(true);		
	}

	@Override
	public void calculateM2() {
		house.setM2(Long.valueOf(100));		
	}

}
