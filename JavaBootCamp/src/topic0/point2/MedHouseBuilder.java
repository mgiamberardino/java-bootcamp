package topic0.point2;

public class MedHouseBuilder implements HouseBuilder {

	House house;
	
	public MedHouseBuilder() {
		super();
		house = new House();
	}

	@Override
	public House buildHouse() {
		// TODO Auto-generated method stub
		return house;
	}
	
	@Override
	public void buildRooms() {
		// TODO Auto-generated method stub
		house.setnRooms(3);
	}

	@Override
	public void buildBathRooms() {
		// TODO Auto-generated method stub
		house.setnBathRooms(2);		
	}

	@Override
	public void buildFloors() {
		// TODO Auto-generated method stub
		house.setnFloors(2);		
	}

	@Override
	public void buildGarage() {
		// TODO Auto-generated method stub
		house.setGarage(true);		
	}

	@Override
	public void calculateM2() {
		// TODO Auto-generated method stub
		house.setM2(Long.valueOf(100));		
	}

}
