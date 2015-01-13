package topic0.point2;

public class SmallHouseBuilder implements HouseBuilder {

	private boolean twoRooms=false;
	private House house;
	public SmallHouseBuilder(boolean twoRooms) {
		this.twoRooms = twoRooms;
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
		if (twoRooms){
			house.setnRooms(2);
		}else{
			house.setnRooms(1);
		}
	}

	@Override
	public void buildBathRooms() {
		// TODO Auto-generated method stub
		house.setnBathRooms(1);		
	}

	@Override
	public void buildFloors() {
		// TODO Auto-generated method stub
		house.setnFloors(1);		
	}

	@Override
	public void buildGarage() {
		// TODO Auto-generated method stub
		if (twoRooms){
			house.setGarage(false);
		}else{
			house.setGarage(true);
		}		
	}

	@Override
	public void calculateM2() {
		// TODO Auto-generated method stub
		house.setM2(Long.valueOf(50));		
	}

}
