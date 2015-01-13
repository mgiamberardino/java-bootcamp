package topic0.point2;

/*
 * This is a builder implementation of a Builder Pattern. 
 * 
 * This class is a builder of a House. This builder builds a small size house.
 */

public class SmallHouseBuilder implements HouseBuilder {

	/*
	 * If have one or two rooms.
	 */
	private boolean twoRooms = false;

	/*
	 * Instance of the house to build
	 */
	private House house;

	/*
	 * Complete construtor
	 */
	public SmallHouseBuilder(boolean twoRooms) {
		this.twoRooms = twoRooms;
		house = new House();
	}

	@Override
	public House buildHouse() {
		return house;
	}

	@Override
	public void buildRooms() {
		if (twoRooms) {
			house.setnRooms(2);
		} else {
			house.setnRooms(1);
		}
	}

	@Override
	public void buildBathRooms() {
		house.setnBathRooms(1);
	}

	@Override
	public void buildFloors() {
		house.setnFloors(1);
	}

	@Override
	public void buildGarage() {
		if (twoRooms) {
			house.setGarage(false);
		} else {
			house.setGarage(true);
		}
	}

	@Override
	public void calculateM2() {
		house.setM2(Long.valueOf(50));
	}

}
